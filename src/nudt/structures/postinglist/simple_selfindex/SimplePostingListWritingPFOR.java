package nudt.structures.postinglist.simple_selfindex;

import java.io.IOException;
import java.nio.ByteBuffer;

import nudt.compression.mine.PForEncoding;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.utils.Closeable;
import nudt.utils.Constants;

//no skip structure, encode docid and freqs together
public class SimplePostingListWritingPFOR implements Closeable{
	
	private PForEncoding encoder;
	
	private ByteBuffer chunkbuffer;
	private int[] chunklengths;
	private int writeptr = 0;
	private int readptr = 0;
	
	private BufferWrapper outwriter;
	
    public SimplePostingListWritingPFOR(BufferWrapper buffer) throws IOException, InterruptedException {
        outwriter = buffer;
        chunkbuffer = ByteBuffer.allocateDirect(8 * Constants.MAX_NUMBER_OF_DOCUMENTS);
        chunklengths = new int[(Constants.MAX_NUMBER_OF_DOCUMENTS >> 7) + 1];
        encoder = new PForEncoding();
        //encoder=new Simple9Encoding();
    }
     	
	private void flushChunks(int limit) {
		if (limit > writeptr)
			limit = writeptr;
		while (readptr < limit){

			outwriter.put(chunkbuffer, chunklengths[readptr]);//flush chunk number ptr
			readptr++;
		}
	}
	
	private void flush() {
		chunkbuffer.position(0);//reset all buffer positions to 0
		flushChunks(Integer.MAX_VALUE);
		readptr = 0; writeptr = 0; chunkbuffer.position(0);
	}
			
	//track term id and starts/ends of posting lists 	
	private int termId = 0;
	private long lastposition = 0;
	
	public LexiconEntry nextEntry(String term, int n_t, int TF, int[][] scores) {
		int numentries = n_t;//document frequency
		
		int spos, pos, lastpos = 0;
		int diffarray[] = new int[128], prevdocid = 0, curdocid;
		
		for (spos=0; spos + 128 < numentries; spos += 128){
			for (int i=0; i<128; i++){																//generate dgaps
				curdocid = scores[0][spos+i];
				diffarray[i] = curdocid - prevdocid;
				prevdocid = curdocid;
			}
//			encoder.encodeSingle(chunkbuffer, diffarray, 0, 128);									//encode d-gaps
//			encoder.encodeSingle(chunkbuffer, scores[1], spos, 128);								//encode frequencies
			//put together for compression
			int[] tempint=new int[256];
			for(int i=0;i<256;i++){
				if(i<128)
					tempint[i]=diffarray[i];
				else
					tempint[i]=scores[1][i-128];
			}
			encoder.encodeSingle(chunkbuffer, tempint, 0, 256);
			
			pos =  chunkbuffer.position();
			chunklengths[writeptr] = pos - lastpos;													//store chunklength
			lastpos = pos;
			writeptr++;	 //incr. writeptr
		}
		
		//encode the last chunk, force level writers to finish their chunks!
		int rest = numentries - spos;
		for (int i=0; i<rest; i++){																	// generate d-gaps
			curdocid = scores[0][spos+i];
			diffarray[i] = curdocid - prevdocid;
			prevdocid = curdocid;
		}
//		encoder.encodeSingle(chunkbuffer, diffarray, 0, rest);										//same as main loop
//		encoder.encodeSingle(chunkbuffer, scores[1], spos, rest);
		
		int[] tempint=new int[256];
		for(int i=0;i<2*rest;i++){
			if(i<rest)
				tempint[i]=diffarray[i];
			else
				tempint[i]=scores[1][i-rest];
		}
		encoder.encodeSingle(chunkbuffer, tempint, 0, 2*rest);
		
		pos =  chunkbuffer.position();

		chunklengths[writeptr] = pos - lastpos;
		lastpos = pos;
		writeptr++;
		//last chunk

		flush();//store chunklengths[]
		
		//store end position, return lexicon entry, increment termId
		long newpos =  outwriter.position();
//		outwriter.position(lastposition);
//		int temp=outwriter.getInt();
//		outwriter.position(newpos);
		
		LexiconEntry ret = new LexiconEntry(term, termId++, n_t, TF, lastposition, newpos);
		lastposition = newpos;
		
		return ret;
	}

	@Override
	public void close() {
		outwriter.close();
	}
}
