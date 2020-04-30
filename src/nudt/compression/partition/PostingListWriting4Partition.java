package nudt.compression.partition;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

import nudt.compression.NewPForEncoding;
import nudt.compression.mine.PForDecoding;
import nudt.compression.mine.PForEncoding;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.utils.Closeable;
import nudt.utils.Constants;

/**
 * @author <a href="mailto:jk_365@126.com">Kun Jiang</a>
 * @version $Id $.
 * no skip structure,分别压缩
 */

public class PostingListWriting4Partition implements Closeable{
	
	private ByteBuffer chunkbuffer;
	private int chunklengths=0;

	//private OldSimple9_F coder;
	//private OptSimple9_F coder;
	//private OldSimple16_F coder;
	private OptSimple16_F coder;
	//private OptP4D_R coder;
	
	//private OldSimple8b_F coder;
	//private OptSimple8b_F coder;
	//private OPTWAP coder;
	
	//private AFOR2 coder;
	//private VSEBlock coder;
	//private VSENaive coder;
	//private VSESimple coder;

	
	public String getCodecName(){
		return coder.getClass().getSimpleName();
	}
	
	private BufferWrapper outwriter;
    public PostingListWriting4Partition(BufferWrapper buffer) throws IOException, InterruptedException {
        outwriter = buffer;
        chunkbuffer = ByteBuffer.allocateDirect(8 * Constants.MAX_NUMBER_OF_DOCUMENTS);

        //coder = new OldSimple9_F();
        //coder = new OptSimple9_F();
        //coder = new OldSimple16_F();
        coder = new OptSimple16_F();
       //coder = new OptP4D_R();
        
        //coder = new OldSimple8b_F();
        //coder = new OptSimple8b_F();
        //coder = new OPTWAP();
        
        //coder = new AFOR2();
        //coder = new VSEBlock();
        //coder = new VSENaive();
        //coder = new VSESimple();
        
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
		
		//code diffarray and scores[1]with Simple9
		int[] docidout = new int[numentries],freqout = new int[numentries];//Simple9-16 OptPFOR
		//long[] docidout = new long[numentries+2],freqout = new long[numentries+2];//simple8b OPT-WAP(1/5)
		//byte[] docidout = new byte[numentries*4+64],freqout = new byte[numentries*4+64];//AFOR VSE
		
		int[] dcountw ={0}, fcountw = {0};//codeword length

		coder.encode(diffarray, docidout, dcountw);
		coder.encode(scores[1], freqout, fcountw);
		int start = chunkbuffer.position();
		
		/*
		 * LongBuffer longbuffer = chunkbuffer.asLongBuffer();//simple8b(2/5)
		 * longbuffer.put(docidout,0,dcountw[0]);//simple8b(3/5)
		 * longbuffer.put(freqout,0,fcountw[0]);//simple8b(4/5)
		 * chunkbuffer.position(start + (longbuffer.position() << 3));//simple8b(5/5)
		 */        

		IntBuffer intbuffer = chunkbuffer.asIntBuffer();
        intbuffer.put(docidout,0,dcountw[0]);//simple9
        intbuffer.put(freqout,0,fcountw[0]);//simple9
        chunkbuffer.position(start + (intbuffer.position() << 2));//simple9
        
		
/*		chunkbuffer.put(docidout,0,dcountw[0]);//AFOR
        chunkbuffer.put(freqout,0,fcountw[0]);//AFOR
*/       
		
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
