package nudt.structures.postinglist.simple_selfindex;

import nudt.compression.mine.Simple9Coding4SkipSimpleBPR;
import nudt.query.scoremodels.BM25;
import nudt.structures.BufferWrapper;
import nudt.structures.docinfo.FastDocLength;
import nudt.utils.Constants;
import nudt.utils.SimpleStats;

/**
 * 解压过程可以先解压128个docid部分，然后再解压剩余部分，
 * 但buffer.position()应该退回到freq部分压缩的起点处
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id$.
 */
public class SimplePostingListIteratorSkipSimple2{
	
	private BufferWrapper buffer;
	private Simple9Coding4SkipSimpleBPR decoder;
	
	private LevelReader[] levelreaders;
	private final boolean use_skips;
	private int maxSkipLevel;
	private static int skiplength=4096;
	private static int skiplwidth=(int) (Math.log10(skiplength)/Math.log10(2));
	
	private class LevelReader{
		private int level;
		
		private int[] gaps = new int[skiplength];
		private long[] offsets = new long[skiplength+1];
		private int[] docids = new int[skiplength+1];
		
		private int chunkno = 0, iptr = 0;
		
		private int lastchunk, lastposting, maxdocid;
		
		LevelReader(int level, int nt){
			this.level = level;
			 			
			lastchunk = nt >> skiplwidth;
			lastposting = nt - (lastchunk << skiplwidth);
			if (lastposting > 0) {
				lastposting--;
			} else {
				lastposting = skiplength-1;
				lastchunk--;
			}

			if (level < maxSkipLevel){
				levelreaders[level + 1] = new LevelReader(level + 1, lastchunk + 1);
			}
		}

		boolean readNextChunk(){
			if (chunkno >= lastchunk) return false;
			
			if (level < maxSkipLevel){
				LevelReader lr = levelreaders[level + 1];
				if (lr.next()){
					readChunk(lr.getOffset(), lr.getRefDocId(), lr.getChildChunkNo());
					return true;
				}
			} else {
				readChunk(offsets[skiplength], docids[skiplength], chunkno + 1);
				return true;
			}
			
			return false;
		}
		
		void readChunk(long position, int refdocid, int chunkno){
			buffer.position(position);
			readChunk(refdocid, chunkno);
		}
		
		void readChunk(int refdocid, int chunkno){
			SimpleStats.addDescription(4, 2, true);
			
			int postings = (chunkno < lastchunk) ? skiplength : (lastposting + 1);

			int waste=decoder.decode(buffer, 0, docids, 1, postings);
			decoder.decode(buffer, waste, gaps, 0, postings);
			
			offsets[0] = buffer.position();
			docids[0] = refdocid;

			for (int i=0; i<postings; i++) {
				docids[i+1] += docids[i];
				offsets[i+1] = gaps[i] + offsets[i];
			}

			this.chunkno = chunkno;
			iptr = 0;
			maxdocid = docids[postings];
		}
		
		boolean next(){
			int _lastposting = (chunkno < lastchunk) ? skiplength-1 : lastposting;
			if (iptr < _lastposting){
				iptr++;
				return true;
			}
			if (readNextChunk()){
				return true;
			}
			return false;
		}
			
		boolean skipTo(int docid){
			if (docid <= docids[iptr+1]) return true;

			if (docid > maxdocid) {
				if (level < maxSkipLevel) {
					LevelReader lr = levelreaders[level + 1];
					if (lr.skipTo(docid)){
						readChunk(lr.getOffset(), lr.getRefDocId(), lr.getChildChunkNo());
					} else {
						return false;
					}
				} else { //iterate nextChunk until EOF or found
					while (docid > maxdocid) {
						if ( !readNextChunk()) return false;
					}
				}
			}
			
			int postings = (chunkno < lastchunk) ? skiplength : (lastposting + 1);
			for (; iptr < postings; iptr++){
				if (docid <= docids[iptr + 1]){
					return true;
				}
			}
			return false;
		}
		
		private int getChildChunkNo() {
			return chunkno * skiplength + iptr;
		}
		
		int getRefDocId(){
			return docids[iptr];
		}
		
		long getOffset(){
			return offsets[iptr];
		}
	}
	
	private int[] docids = new int[skiplength];
	private int[] freqs = new int[skiplength];
	private int waste;

	private int iptr = 0, chunkno = 0, maxdocid;
	private int lastchunk, lastposting; 
	
	private long startOffset;
	private int nt;
	
	public SimplePostingListIteratorSkipSimple2(BufferWrapper buffer, int nt, long startOffset){
		this.buffer = buffer;
		decoder= new Simple9Coding4SkipSimpleBPR();
		
		lastchunk = nt >> skiplwidth;
		lastposting = nt - (lastchunk << skiplwidth);
		if (lastposting > 0) {
			lastposting--;
		} else {
			lastposting = skiplength-1;
			lastchunk--;
		}
		
		use_skips = Constants.USE_SKIPS & (nt > skiplength); 
		
		this.startOffset = startOffset;
		this.nt = nt;
		buffer.position(startOffset);
		if (use_skips){
			int _skiplevels = skipLevelsRequired(nt);
			levelreaders = new LevelReader[_skiplevels];
			maxSkipLevel = _skiplevels - 1;
			levelreaders[0] = new LevelReader(0, lastchunk + 1);
			
			//decode first skip blocks
			for (int i = maxSkipLevel; i >= 0; i--){
				levelreaders[i].readChunk(0,0);
			}
		}

		//decode the first block itself
		readChunk(0, 0);//can be used to debug
	}
    public static int skipLevelsRequired(int postings){
    	int ret = 0;
    	while ( 1<<(skiplwidth*ret + skiplwidth) < postings ) ret++;
    	return ret;
    }
	/**
	 * Reads next chunk if possible
	 * @return false if there are no more chunks left
	 */
	private boolean readNextChunk(){
		if (chunkno >= lastchunk) return false;
		
		if (use_skips){
			LevelReader lr = levelreaders[0];
			if (lr.next()){
				readChunk(lr.getOffset(), lr.getRefDocId(), lr.getChildChunkNo());
				return true;
			}
		} else {
			readChunk(docids[skiplength-1], chunkno + 1);
			return true;
		}
		return false;
	}
	
	/**
	 * Read a chunk at specified position
	 * @param position chunk start
	 * @param refdocid reference DocId 
	 * @param chunkno sequential chunk number
	 */
	private void readChunk(long position, int refdocid, int chunkno){
		buffer.position(position);
		readChunk(refdocid, chunkno);
	}
	private boolean readFreqChunk = false;
		
	/**
	 * Read a chunk from the buffer (assumed that the pointer is aligned)
	 * @param refdocid reference DocId
	 * @param chunkno sequential chunk number
	 */
	private void readChunk(int refdocid, int chunkno){
		int postings = (chunkno < lastchunk) ? skiplength : (lastposting + 1); 
		
		//此处的疑惑在于考虑到压缩时一次压缩了256个数字,压缩算法没问题，如果解压时先解压128个数字
		//那么buffer的位置会在剩余128个数字的压缩块起始位置吗，如果不在，必须调用position()函数进行定位，
		//可以对压缩算法进行buffer位置测试
		waste=decoder.decode(buffer, 0, docids, 0, postings);
		readFreqChunk = !use_skips;
		if (readFreqChunk){
			decoder.decode(buffer, waste, freqs, 0, postings);
			//buffer.getInt(freqs, 0, postings);	
		} else {
			SimpleStats.addDescription(4, 1, true);
		}
		
		for (int i=0; i<postings; i++) {
			docids[i] += refdocid;
			refdocid = docids[i];
		}
		
		this.chunkno = chunkno;
		iptr = 0;
		maxdocid = refdocid;
	}
	
	private void readFreqChunk(){
		int postings = (chunkno < lastchunk) ? skiplength : (lastposting + 1);
		decoder.decode(buffer, waste, freqs, 0, postings);
		SimpleStats.addDescription(5, 1, true);
		readFreqChunk = true;
	}	
	
	boolean seen_d = false;
	
	/**
	 * Skips to the required entry or the first entry larger than the required
	 * @return false if EOF
	 */
	public boolean skipTo(int docid){
		if (docid <= docids[iptr]) return true;
		
		seen_d = false;
		if (docid > maxdocid) {//一次解压的最大docid
			if (use_skips) {
				LevelReader lr = levelreaders[0];
				if (lr.skipTo(docid)){
					readChunk(lr.getOffset(), lr.getRefDocId(), lr.getChildChunkNo());
				} else {
					return false;
				}
			} else { //iterate nextChunk until EOF or found
				while (docid > maxdocid) {
					if ( !readNextChunk()) return false;
				}
			}
		}
		
		int postings = (chunkno < lastchunk) ? skiplength : (lastposting + 1);
		for (; iptr<postings; iptr++){
			if (docid <= docids[iptr]){
				return true;
			}
		}
		
		return false;
	}
		
	/**
	 * Fetches the next entry
	 * @return false if EOF
	 */
	public boolean next(){
		seen_d = false;
		int _lastposting = (chunkno < lastchunk) ? skiplength-1 : lastposting;
		if (iptr < _lastposting){
			iptr++;
			return true;
		}
		if (readNextChunk()){
			return true;
		}
		return false;
	}
	
	/**
	 * Returns current docID
	 * @return
	 */
	public final int getDocId(){
		if (!seen_d){
			SimpleStats.addDescription(2, 1, true);
			seen_d = true;
		}
		return docids[iptr];
	}
	
	/**
	 * returns current frequency
	 * @return
	 */
	public final int getFrequency(){
		if (!readFreqChunk) readFreqChunk();
		return freqs[iptr];
	}

	public void close() {
		buffer.close();
	}
	
	public void reset() {
		buffer.position(startOffset);
		if (use_skips){
			int _skiplevels = SimplePostingListWritingSkipRaw.skipLevelsRequired(nt);
			levelreaders = new LevelReader[_skiplevels];
			maxSkipLevel = _skiplevels - 1;
			levelreaders[0] = new LevelReader(0, lastchunk + 1);
			
			//decode first skip blocks
			for (int i = maxSkipLevel; i >= 0; i--){
				levelreaders[i].readChunk(0,0);
			}
		}
		//decode the first block itself
		readChunk(0, 0);
	}
	
	private double precomputed;
	private BM25 wmodel = null;
	public double maxScore;
	public int iteratorNo;
	
	public void prepareForScoring(double keyFreq, double docFreq, double termFreq,
			double numOfDocs, double avgDocLength){
		wmodel = new BM25();
		wmodel.setKeyFrequency(keyFreq);
		wmodel.setDocumentFrequency(docFreq);
		wmodel.setTermFrequency(termFreq);
		wmodel.setNumberOfDocuments(numOfDocs);
		wmodel.setAverageDocumentLength(avgDocLength);
		precomputed = wmodel.precompute();
	}	

	public void prepareForScoringwithMaxScore(double keyFreq, int termId, double docFreq, double termFreq,
			double numOfDocs, double avgDocLength){
		wmodel = new BM25();
		wmodel.setKeyFrequency(keyFreq);
		wmodel.setDocumentFrequency(docFreq);
		wmodel.setTermFrequency(termFreq);
		wmodel.setNumberOfDocuments(numOfDocs);
		wmodel.setAverageDocumentLength(avgDocLength);
		precomputed = wmodel.precompute();
	}
	
	public double getScore() {
		SimpleStats.addDescription(1, 1, true);
		if (!readFreqChunk) readFreqChunk();
		return wmodel.score(freqs[iptr], FastDocLength.getNumberOfTokens(docids[iptr]), precomputed);
	}
	
}
