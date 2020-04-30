package nudt.structures.postinglist.simple_selfindex;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import nudt.compression.mine.PForEncoding;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.utils.Closeable;
import nudt.utils.Constants;

//no skip structure, no compression
public class SimplePostingListWritingRaw implements Closeable{
	
	private ByteBuffer chunkbuffer;
	private int chunklengths=0;
	
	private BufferWrapper outwriter;
	
    public SimplePostingListWritingRaw(BufferWrapper buffer) throws IOException, InterruptedException {
        outwriter = buffer;
        chunkbuffer = ByteBuffer.allocateDirect(8 * Constants.MAX_NUMBER_OF_DOCUMENTS);
        
    }
	
	private void flush() {
		chunkbuffer.position(0);//reset all buffer positions to 0
		outwriter.put(chunkbuffer, chunklengths);//flush chunk number ptr
		chunkbuffer.position(0);
	}
			
	//track term id and starts/ends of posting lists 	
	private int termId = 0;
	private long lastposition = 0;
	
	public LexiconEntry nextEntry(String term, int n_t, int TF, int[][] scores) {
		int numentries = n_t;//document frequency
		
		int spos = 0;
		int diffarray[] = new int[numentries], prevdocid = 0, curdocid;
		
		for (spos=0; spos< numentries; spos++){																//generate dgaps
				curdocid = scores[0][spos];
				diffarray[spos] = curdocid - prevdocid;
				prevdocid = curdocid;
		}
		
		//put the int array tempint into bytebuffer chunkbuffer
		int start = chunkbuffer.position();
        IntBuffer intbuffer = chunkbuffer.asIntBuffer();
        intbuffer.put(diffarray,0,n_t);
        intbuffer.put(scores[1],0,n_t);
        chunkbuffer.position(start + (intbuffer.position() << 2));
        chunklengths =  chunkbuffer.position();		
		
		flush();//store chunklengths
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
