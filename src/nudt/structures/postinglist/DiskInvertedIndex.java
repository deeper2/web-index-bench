package nudt.structures.postinglist;

import java.io.IOException;

import nudt.buffering.BufferPool;
import nudt.compression.partition.PostingListIterator4Partition;
import nudt.structures.BufferWrapper;
import nudt.structures.FileWrapper;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipSimple;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipSimple2;


/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @see Index File IO refer to Class Index.java
 * @version $Id $.
 */
public class DiskInvertedIndex {
	private BufferPool bufferpool;
	private int fileNumber;
	
	public DiskInvertedIndex(BufferPool bufferpool, int fileNumber){
		this.bufferpool = bufferpool;
		this.fileNumber = fileNumber;
	}
/*	public DiskInvertedIndex getInvertedIndex(){
		return new DiskInvertedIndex(pool, getFileNumber(path+"/index.inv"));
	}//index input in Index Class
*/
	public DefaultPostingListIterator getDefaultPostingListIterator(LexiconEntry lEntry){
		try {
			long startOffset = lEntry.getStartOffset();
			//int endOffset=(int)(lEntry.getEndOffset()-startOffset)>>2;
			//new buffer wrapper, also fetch the first block of the posting list at once!
			BufferWrapper buffer = new FileWrapper(bufferpool, fileNumber, startOffset);
			//set the address to zero as it is relative to the buffer's start address.
			return new DefaultPostingListIterator(buffer, lEntry.getN_t(), 0);
				
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public PostingListIterator4Partition getPostingListIterator(LexiconEntry lEntry){
		try {
			long startOffset = lEntry.getStartOffset();
			//new buffer wrapper, also fetch the first block of the posting list at once!
			BufferWrapper buffer = new FileWrapper(bufferpool, fileNumber, startOffset);
			//set the address to zero as it is relative to the buffer's start address.
			long wordoffset=lEntry.getEndOffset()-lEntry.getStartOffset();
			//return new SimplePostingListIteratorSimple(buffer, lEntry.getN_t(),0);
			return new PostingListIterator4Partition(buffer, lEntry.getN_t(),(int)wordoffset);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}		
}
