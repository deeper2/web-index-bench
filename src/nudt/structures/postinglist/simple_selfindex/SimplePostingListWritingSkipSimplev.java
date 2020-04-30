package nudt.structures.postinglist.simple_selfindex;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import nudt.compression.mine.Simple16Coding4SkipSimple;
import nudt.compression.mine.Simple9Coding4SkipSimpleBPR;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.utils.Closeable;
import nudt.utils.Constants;
//varying block skiplength
//skip encode docid and freqs together
//每256个docid和freqs采用simple仅仅压缩一次 一起压缩
public class SimplePostingListWritingSkipSimplev implements Closeable{
	private LevelWriter[] levelwriters;
	//private Simple9Coding4SkipSimpleBPR coder;
	private Simple16Coding4SkipSimple coder;
	
	private ByteBuffer chunkbuffer;
	private int[] chunklengths;
	private int writeptr = 0;
	private int readptr = 0;
	
	private BufferWrapper outwriter;
	private int currentMaxLevel;
	
	private boolean use_skips;
	private static int skiplength=4096;
	private static int skiplwidth=(int) (Math.log10(skiplength)/Math.log10(2));
    public SimplePostingListWritingSkipSimplev(BufferWrapper buffer) throws IOException, InterruptedException {
        outwriter = buffer;
        chunkbuffer = ByteBuffer.allocateDirect(8 * Constants.MAX_NUMBER_OF_DOCUMENTS);
        chunklengths = new int[(Constants.MAX_NUMBER_OF_DOCUMENTS >> skiplwidth) + 1];
        
        use_skips = Constants.USE_SKIPS;
        if (use_skips){
        	int maxlevels = skipLevelsRequired(Constants.MAX_NUMBER_OF_DOCUMENTS);
        	int postingsExpected = Constants.MAX_NUMBER_OF_DOCUMENTS;
        	levelwriters = new LevelWriter[maxlevels];
        	for (int i=0; i < maxlevels; i++){
        		postingsExpected = (postingsExpected >> skiplwidth) + 1;
        		levelwriters[i] = new LevelWriter(i,
        				ByteBuffer.allocateDirect(8 * postingsExpected),
        				new int[(postingsExpected >> skiplwidth) + 1]);
        		//System.out.println(i+ ":" + postingsExpected);
        	}
        }
        //coder = new Simple9Coding4SkipSimpleBPR();
        coder = new Simple16Coding4SkipSimple();
        
    }
    
    public static int skipLevelsRequired(int postings){
    	int ret = 0;
    	while ( (skiplwidth*ret + skiplwidth)<31 && 1<<(skiplwidth*ret + skiplwidth) < postings ){
    		ret++;
    	}
    	return ret;
    }
    
	private class LevelWriter{
		int level;
		ByteBuffer bytebuffer;
		int[] lenarray;
		int[] docids = new int[skiplength];
		int[] offsets = new int[skiplength];
		int lastdocid =0, lastoffset = 0, writeptr = 0, readptr = 0, lastpos = 0, iptr = 0;
		//int _entries = 0;
		
		LevelWriter(int level, ByteBuffer bytebuffer, int[] lenarray){
			this.level = level;
			this.bytebuffer = bytebuffer;
			this.lenarray = lenarray;
		}
		
		void addEntry(int docid, int offset, boolean force){
			docids[iptr] = docid - lastdocid;
			lastdocid = docid;//d-gaps
			offsets[iptr] = offset - lastoffset;
			lastoffset = offset;
			
			if (++iptr == skiplength | force){//if entrys >128 encode them
				//code diffarray and scores[1]with Simple9
				int[] docountw ={0};
				int[] docidoffout = new int[iptr*2];
				//transfer object
				int[] tempint=new int[iptr*2];
				for(int i=0;i<2*iptr;i++){
					if(i<iptr)
						tempint[i]=docids[i];
					else
						tempint[i]=offsets[i-iptr];
				}
				coder.encode(tempint, 2*iptr, docidoffout, docountw);
				//put the int array tempint into bytebuffer chunkbuffer
				int start = bytebuffer.position();
				IntBuffer intbuffer = bytebuffer.asIntBuffer();
		        intbuffer.put(docidoffout, 0, docountw[0]);
		        bytebuffer.position(start + (intbuffer.position() << 2));
				
				int newpos = bytebuffer.position();
				lenarray[writeptr] = newpos - lastpos;
				lastpos = newpos;

				writeptr++;				
				
				if (level < currentMaxLevel)//iterates
					levelwriters[level + 1].addEntry(docid, offset + newpos, force);
				iptr = 0;
			}
		}
		
		void flushSkipChunks(int limit) {
			if (limit > writeptr) limit = writeptr;
			
			while (readptr < limit){
				//write chunk-pair number ptr
				outwriter.put(bytebuffer, lenarray[readptr]);
				
				if (level > 0) {
					levelwriters[level-1].flushSkipChunks((readptr+1)<<skiplwidth);
				} else {
					flushChunks((readptr+1)<<skiplwidth);
				}
				readptr++;
			}
		}
		
		void reset(){
			lastdocid =0; lastoffset = 0; writeptr = 0;
			readptr = 0; lastpos = 0; iptr = 0;
			//_entries = 0;
			bytebuffer.position(0);
		}
	}//end class levelwriter
	
	private void flushChunks(int limit) {
		if (limit > writeptr)
			limit = writeptr;
		while (readptr < limit){
			outwriter.put(chunkbuffer, chunklengths[readptr]);//flush chunk number ptr
			readptr++;
		}
	}
	
	private void flush(int toplevel) {//1.used in level
		chunkbuffer.position(0);													   //reset all buffer positions to 0
		for (LevelWriter lw : levelwriters){
			lw.bytebuffer.position(0);
		}
		
		if (toplevel < 0)
			flushChunks(Integer.MAX_VALUE);
		else 
			levelwriters[toplevel].flushSkipChunks(Integer.MAX_VALUE);
		
		//reset chunkbuffer and skip writers
		readptr = 0; writeptr = 0; chunkbuffer.position(0);
		for (LevelWriter lw : levelwriters)	lw.reset();
	}
	
	private void flush() {//2. used in other
		chunkbuffer.position(0);													   //reset all buffer positions to 0
		flushChunks(Integer.MAX_VALUE);
		readptr = 0; writeptr = 0; chunkbuffer.position(0);
	}
			
	//track term id and starts/ends of posting lists 	
	private int termId = 0;
	private long lastposition = 0;
	
	//the only outer api
	public LexiconEntry nextEntry(String term, int n_t, int TF, int[][] scores) {
		int numentries = n_t;//document frequency
		currentMaxLevel =  skipLevelsRequired(n_t) - 1;//skiplevel is index from 0
		//System.out.println(currentMaxLevel+"<<<" + n_t);
		boolean _useskips = currentMaxLevel > -1;//need to skip
		
		int spos, pos, lastpos = 0;
		int diffarray[] = new int[skiplength], prevdocid = 0, curdocid;
		int tempscore[] =new int[skiplength];
		
		for (spos=0; spos + skiplength < numentries; spos+=skiplength){
			for (int i=0; i<skiplength; i++){																//generate dgaps
				curdocid = scores[0][spos+i];
				diffarray[i] = curdocid - prevdocid;
				prevdocid = curdocid;
			}
			
			//128 score
			for (int i=0; i<skiplength; i++){
				tempscore[i]= scores[1][spos+i];
			}

			//code diffarray and scores[1]with Simple9
			int[] docountw ={0};
			int[] docidoffout = new int[skiplength*2];
			//transfer object
			
			int[] tempint=new int[skiplength*2];
			for(int i=0; i < skiplength*2; i++){
				if(i < skiplength)
					tempint[i]=diffarray[i];
				else
					tempint[i]=tempscore[i-skiplength];
			}
			coder.encode(tempint, skiplength*2, docidoffout, docountw);
			
			//put the int array tempint into bytebuffer chunkbuffer
			int start = chunkbuffer.position();
	        IntBuffer intbuffer = chunkbuffer.asIntBuffer();
	        //failure: intbuffer.put(tempint,0,docountw[0]);
	        intbuffer.put(docidoffout,0,docountw[0]);
	        chunkbuffer.position(start + (intbuffer.position() << 2));
	        
			pos =  chunkbuffer.position();
			chunklengths[writeptr] = pos - lastpos;													//store chunklength
			lastpos = pos;
			writeptr++;					//incr. writeptr
			
			if (use_skips & _useskips)//want to skip and need to skip
				levelwriters[0].addEntry(scores[0][spos+skiplength-1], lastpos, false);//the last raw docid(127) is added to higher level
		}
		
		//encode the last chunk, force level writers to finish their chunks!
		int rest = numentries - spos;
		for (int i=0; i<rest; i++){																	// generate d-gaps
			curdocid = scores[0][spos+i];
			diffarray[i] = curdocid - prevdocid;
			prevdocid = curdocid;
		}
		
		for (int i=0; i<rest; i++){
			tempscore[i]= scores[1][spos+i];
		}

		//code diffarray and scores[1]with Simple-9
		int[] docountw ={0};
		int[] docidoffout = new int[rest*2];
		//transfer object
		
		int[] tempint=new int[2*rest];
		for(int i = 0; i < 2*rest; i++){
			if(i < rest)
				tempint[i]=diffarray[i];
			else
				tempint[i]=tempscore[i-rest];
		}
		coder.encode(tempint, 2*rest, docidoffout, docountw);
		
		//put the int array into bytebuffer chunkbuffer
		int start = chunkbuffer.position();
		IntBuffer intbuffer = chunkbuffer.asIntBuffer();
        intbuffer.put(docidoffout, 0, docountw[0]);
        chunkbuffer.position(start + (intbuffer.position() << 2));
		pos =  chunkbuffer.position();
		chunklengths[writeptr] = pos - lastpos;
		lastpos = pos;
		writeptr++;
		
		if (use_skips & _useskips){
			levelwriters[0].addEntry(scores[0][numentries-1], lastpos, true);
			//flush writers to file and reset.
			flush(currentMaxLevel); 
		} else {
			flush();
		}
		
		//store end position, return lexicon entry, increment termId
		long newpos =  outwriter.position();
		LexiconEntry ret = new LexiconEntry(term, termId++, n_t, TF, lastposition, newpos);
		lastposition = newpos;
		return ret;
	}

	@Override
	public void close() {
		outwriter.close();
	}
}
