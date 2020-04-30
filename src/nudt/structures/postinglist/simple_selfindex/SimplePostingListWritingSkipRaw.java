package nudt.structures.postinglist.simple_selfindex;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import nudt.compression.mine.PForEncoding;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.utils.Closeable;
import nudt.utils.Constants;

//skip encode docid and freqs together
public class SimplePostingListWritingSkipRaw implements Closeable{
	private LevelWriter[] levelwriters;
	
	private ByteBuffer chunkbuffer;
	private int[] chunklengths;
	private int writeptr = 0;
	private int readptr = 0;
	
	private BufferWrapper outwriter;
	private int currentMaxLevel;
	
	private boolean use_skips;
	
    public SimplePostingListWritingSkipRaw(BufferWrapper buffer) throws IOException, InterruptedException {
        outwriter = buffer;
        chunkbuffer = ByteBuffer.allocateDirect(8 * Constants.MAX_NUMBER_OF_DOCUMENTS);
        chunklengths = new int[(Constants.MAX_NUMBER_OF_DOCUMENTS >> 7) + 1];
        
        use_skips = Constants.USE_SKIPS;
        if (use_skips){
        	int maxlevels = skipLevelsRequired(Constants.MAX_NUMBER_OF_DOCUMENTS);
        	int postingsExpected = Constants.MAX_NUMBER_OF_DOCUMENTS;
        	levelwriters = new LevelWriter[maxlevels];
        	for (int i=0; i < maxlevels; i++){
        		postingsExpected = (postingsExpected >> 7) + 1;
        		levelwriters[i] = new LevelWriter(i,
        				ByteBuffer.allocateDirect(8 * postingsExpected),
        				new int[(postingsExpected >> 7) + 1]);
        		//System.out.println(i+ ":" + postingsExpected);
        	}
        }
    }
    
    public static int skipLevelsRequired(int postings){
    	int ret = 0;
    	while ( 1<<(7*ret + 7) < postings ) ret++;
    	return ret;
    }
    
	private class LevelWriter{
		int level;
		ByteBuffer bytebuffer;
		int[] lenarray;
		int[] docids = new int[128];
		int[] offsets = new int[128];
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
			
			if (++iptr == 128 | force){//if entrys >128 encode them
//				encoder.encodeSingle(bytebuffer, docids, 0, iptr);
//				encoder.encodeSingle(bytebuffer, offsets, 0, iptr);
				//put the int array tempint into bytebuffer chunkbuffer
				int start = bytebuffer.position();
				IntBuffer intbuffer = bytebuffer.asIntBuffer();
		        intbuffer.put(docids, 0, iptr);
		        intbuffer.put(offsets, 0, iptr);
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
					levelwriters[level-1].flushSkipChunks((readptr+1)<<7);
				} else {
					flushChunks((readptr+1)<<7);
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
		int numentries = n_t;//documentfrequency
		currentMaxLevel =  skipLevelsRequired(n_t) - 1;//skiplevel is index from 0
		//System.out.println(currentMaxLevel+"<<<" + n_t);
		boolean _useskips = currentMaxLevel > -1;//need to skip
		
		int spos, pos, lastpos = 0;
		int diffarray[] = new int[128], prevdocid = 0, curdocid;
		
		for (spos=0; spos + 128 < numentries; spos+=128){
			for (int i=0; i<128; i++){																//generate dgaps
				curdocid = scores[0][spos+i];
				diffarray[i] = curdocid - prevdocid;
				prevdocid = curdocid;
			}
			//encode frequencies
			
			//put the int array tempint into bytebuffer chunkbuffer
			int start = chunkbuffer.position();
	        IntBuffer intbuffer = chunkbuffer.asIntBuffer();
	        intbuffer.put(diffarray,0,128);
	        intbuffer.put(scores[1],spos,128);
	        chunkbuffer.position(start + (intbuffer.position() << 2));
	        
			pos =  chunkbuffer.position();
			chunklengths[writeptr] = pos - lastpos;													//store chunklength
			lastpos = pos;
			writeptr++;																//incr. writeptr
			
			if (use_skips & _useskips)//want to skip and need to skip
				levelwriters[0].addEntry(scores[0][spos+127], lastpos, false);//the last raw docid(127) is added to higher level
		}
		
		//encode the last chunk, force level writers to finish their chunks!
		int rest = numentries - spos;
		for (int i=0; i<rest; i++){																	// generate d-gaps
			curdocid = scores[0][spos+i];
			diffarray[i] = curdocid - prevdocid;
			prevdocid = curdocid;
		}
	
		//put the int array into bytebuffer chunkbuffer
		int start = chunkbuffer.position();
		IntBuffer intbuffer = chunkbuffer.asIntBuffer();
        intbuffer.put(diffarray,0,rest);
        intbuffer.put(scores[1],spos,rest);
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
