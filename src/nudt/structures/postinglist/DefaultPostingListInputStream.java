package nudt.structures.postinglist;

import nudt.compression.partition.PostingListIterator4Partition;
import nudt.structures.BufferWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.lexicon.LexiconInputStream;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 * for loading local index to flat
 * can also use class DefaultPostingListIterator
 */
public class DefaultPostingListInputStream{
	public BufferWrapper buffer;
	protected LexiconInputStream lexiconInput;
	
	public DefaultPostingListInputStream(BufferWrapper buffer, LexiconInputStream lexiconInput){
		this.buffer = buffer;
		this.lexiconInput = lexiconInput;
	}
	
	private LexiconEntry lEntry = null;
	//private PostingListIterator4Partition iter = null;
	private DefaultPostingListIterator iter = null;

	public LexiconEntry nextEntry(){
		lEntry = lexiconInput.nextEntry();
		//System.out.println(lEntry.getTermId()+" "+lEntry.getTerm()+" "+lEntry.getN_t()+" "+lEntry.getTF());
		if (lEntry != null){
			iter = new DefaultPostingListIterator(buffer, lEntry.getN_t(), lEntry.getStartOffset());
			//iter = new PostingListIterator4Partition(buffer, lEntry.getN_t(), lEntry.getStartOffset());
		}
		return lEntry;
	}

	public int getDocId() {
		if (iter != null) return iter.getDocId();
		else return -1;
	}

	public int getFrequency() {
		if (iter != null) return iter.getFrequency();
		else return -1;
	}

	public boolean next() {
		if (iter != null) return iter.next();
		else return false;
	}

	public boolean skipTo(int docid) {
		if (iter != null) return iter.skipTo(docid);
		else return false;
	}
	
	public void close() {
		if (iter!=null) iter.close();
		else buffer.close();
		lexiconInput.close();
	}

	public double getScore() {
		return 0;
		
	}
}
