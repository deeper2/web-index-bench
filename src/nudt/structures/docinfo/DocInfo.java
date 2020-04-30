package nudt.structures.docinfo;

import java.io.IOException;

import nudt.structures.BufferWrapper;
import nudt.utils.Closeable;
import nudt.utils.Constants;



/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class DocInfo implements Closeable{
	private final int totEntries;
	private BufferWrapper buffer;
	
    public DocInfo(BufferWrapper buffer, int entries) {
        this.buffer = buffer;
        totEntries = entries;
    }
    
    /**
     * Look up DocDict with a specified docno
     * @param docno
     * @return
     * @throws InterruptedException
     * @throws IOException
     */
    public DocInfoEntry lookup(String docno) {
    	int low = 0;
		int high = totEntries - 1;
		int i;
		int compareStrings;
		String _docno;
		
		synchronized (buffer) {
			while (high >= low) {
				i = (high + low) >> 1;				
				_docno = getDocno(i);
				if ((compareStrings = docno.compareTo(_docno)) < 0) high = i - 1;
				else if (compareStrings > 0) low = i + 1;
				else return getDocDictEntry(i);
			}
		}
		
		return null; 
	}
    
    /**
     * Look up LexiconEntry with a specified term ID
     * @param termId
     * @return
     * @throws InterruptedException
     * @throws IOException
     */
    public DocInfoEntry lookup(int docId) {
      	int low = 0;
      	int high = totEntries - 1;
      	int i;
		int _docId;
		
		synchronized (buffer) {
			while (high >= low) {
				i = (high + low) >> 1;
				_docId = getDocId(i);
				if ( docId < _docId) high = i - 1;
				else if ( docId > _docId) low = i + 1;
				else return getDocDictEntry(i);
			}
		}
		
		return null; 
	}
    
    
    private static byte [] textbuffer = new byte[Constants.DOCNO_BYTE_LENGTH]; 
    
    /**
     * Get the docno of the specified entry
     * 
     * @param entryNumber the number of the docdictionary entry
     * @return docno
     * @throws IOException
     * @throws InterruptedException
     */
	private String getDocno(long entryNumber) {
    	buffer.position(entryNumber * DocInfoEntry.ENTRY_SIZE + Constants.INT_SIZE);
		buffer.get(textbuffer, 0, textbuffer.length);
		return new String(textbuffer).trim();
    }
    
    /**
     * Get the doc ID of the specified entry.
     * 
     * @param entryNumber the number of the docdict entry
     * @return term ID
     * @throws IOException
     * @throws InterruptedException
     */
    private int getDocId(long entryNumber) { 
    	buffer.position(entryNumber * DocInfoEntry.ENTRY_SIZE);
		return buffer.getInt();
    }
    
    /**
     * Get a docdict entry.
     * 
     * @param entryNumber the number of the docdict entry
     * @return the docdict entry itself
     * @throws IOException
     * @throws InterruptedException
     */
    private DocInfoEntry getDocDictEntry(long entryNumber) {
    	buffer.position(entryNumber * DocInfoEntry.ENTRY_SIZE);
		int docid = buffer.getInt();    	
		buffer.get(textbuffer, 0, textbuffer.length);
		String docno = new String(textbuffer).trim();
		int numTokens = buffer.getInt();
		return new DocInfoEntry(docid, docno, numTokens);	
    }

    /**
     * Closes the lexicon, unpins the current buffer, etc.
     */
    @Override
    public void close() {
    	buffer.close();
    }
}