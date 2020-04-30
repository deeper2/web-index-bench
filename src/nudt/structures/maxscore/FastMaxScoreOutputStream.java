package nudt.structures.maxscore;

import nudt.structures.BufferWrapper;
import nudt.utils.Closeable;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class FastMaxScoreOutputStream implements Closeable{
	private BufferWrapper buffer;

	private int numberOfTerms = 0;
	
    public FastMaxScoreOutputStream(BufferWrapper buffer) {
    	this.buffer = buffer;
    }
    
	public void nextEntry(int termid, double maxScore) {
		buffer.putInt(termid);
		buffer.putDouble(maxScore);
        numberOfTerms++;
    }
	
    @Override
    public void close() {
    	buffer.close();
    }
    
    public long numberOfTerms(){
    	return numberOfTerms;
    }
}
