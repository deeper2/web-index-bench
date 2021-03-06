package nudt.structures.lexicon;

import nudt.structures.BufferWrapper;
import nudt.utils.Closeable;
import nudt.utils.Constants;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class LexiconOutputStream implements Closeable{
	private BufferWrapper buffer;

	private int numberOfTerms = 0;
	private long numberOfTokens = 0;
	private long numberOfPointers = 0;
	
    public LexiconOutputStream(BufferWrapper buffer){
    	this.buffer = buffer;
    }
    
    private static final byte [] zerobuffer = new byte[Constants.STRING_BYTE_LENGTH];
    
	public void nextEntry(String term, int termid, int n_t, int TF, long endOffset) {
		byte[] termbytes = term.getBytes();
		if (termbytes.length > Constants.STRING_BYTE_LENGTH)
			System.out.println("ERROR! THE TERM IS TOO LONG!" + term.length()+" "+termbytes.length);
		buffer.put(termbytes, 0, termbytes.length);
		// padding with 0 bytes, wasting too much space
        buffer.put(zerobuffer, 0, Constants.STRING_BYTE_LENGTH - termbytes.length);
        buffer.putInt(termid);
        buffer.putInt(n_t);
        buffer.putInt(TF);
        buffer.putLong(endOffset);
        
        numberOfTerms++; numberOfPointers += n_t; numberOfTokens += TF;
    }
	
	public void nextEntry(LexiconEntry l) {
		nextEntry(l.term, l.termid, l.n_t, l.TF, l.endOffset);
    }
	
    @Override
    public void close() {
    	buffer.close();
    }
    
    public int getNumberOfTerms(){
    	return numberOfTerms;
    }

    public long getNumberOfTokens(){
    	return numberOfTokens;
    }
    
    public long getNumberOfPointers(){
    	return numberOfPointers;
    }
}
