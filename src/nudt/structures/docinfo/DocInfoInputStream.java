package nudt.structures.docinfo;

import nudt.structures.BufferWrapper;
import nudt.utils.Closeable;
import nudt.utils.Constants;



/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class DocInfoInputStream implements Closeable{
	private BufferWrapper buffer;
	
	private int numberOfDocuments = 0;
	
    public DocInfoInputStream(BufferWrapper buffer) {
        this.buffer = buffer;
    }
    
    private static byte [] textbuffer = new byte[Constants.DOCNO_BYTE_LENGTH]; 
    
    public DocInfoEntry nextEntry() {
    	numberOfDocuments++;
    	int docid = buffer.getInt();
    	buffer.get(textbuffer, 0, textbuffer.length);
		String docno = new String(textbuffer).trim();
		
		int numTokens = buffer.getInt();
		return new DocInfoEntry(docid, docno, numTokens);
    }

    @Override
    public void close() {
    	buffer.close();
    }
    
    public int numberOfDocuments(){
    	return numberOfDocuments;
    }
}
