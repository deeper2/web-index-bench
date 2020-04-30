package nudt.structures.postinglist.simple_selfindex;

import nudt.compression.NewPForDecoding;
import nudt.compression.mine.PForDecoding;
import nudt.query.scoremodels.BM25;
import nudt.structures.BufferWrapper;
import nudt.structures.docinfo.FastDocLength;
import nudt.utils.Constants;
import nudt.utils.SimpleStats;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class SimplePostingListIteratorPFOR{
	
	private BufferWrapper buffer;
	private PForDecoding decoder;
	
	private final boolean use_skips;
	private int[] docids = new int[128];
	private int[] freqs = new int[128];
	private int[] tempint=new int[256];
	private int iptr = 0, chunkno = 0, maxdocid;
	private int lastchunk, lastposting; 
	
	private long startOffset;
	public SimplePostingListIteratorPFOR(BufferWrapper buffer, int nt, long startOffset){
		this.buffer = buffer;
		decoder = new PForDecoding();
		
		lastchunk = nt >> 7;
		lastposting = nt - (lastchunk << 7);
		if (lastposting > 0) {
			lastposting--;
		} else {
			lastposting = 127;
			lastchunk--;
		}
		
		use_skips = Constants.USE_SKIPS & (nt > 128); 
		
		this.startOffset = startOffset;
		buffer.position(startOffset);
		
		//decode the first block itself
		readChunk(0, 0);
	}

	/**
	 * Reads next chunk if possible
	 * @return false if there are no more chunks left
	 */
	private boolean readNextChunk(){
		if (chunkno >= lastchunk) return false;
		readChunk(docids[127], chunkno + 1);
		return true;	
	}
	
	private boolean readFreqChunk = false;
		
	/**
	 * Read a chunk from the buffer (assumed that the pointer is aligned)
	 * @param refdocid reference DocId
	 * @param chunkno sequential chunk number
	 */
	private void readChunk(int refdocid, int chunkno){
		int postings = (chunkno < lastchunk) ? 256 : (lastposting + 1)*2; 

		//decoder.decodeSingle(buffer, postings, docids, 0);
		
		readFreqChunk = !use_skips;
		if (readFreqChunk){
			decoder.decodeSingle(buffer, postings, tempint, 0);
			SimpleStats.addDescription(4, 2, true);
			SimpleStats.addDescription(4, 1, true);
			for(int i=0;i<postings;i++){
				if(i<postings/2)
					docids[i]=tempint[i];
				else
					freqs[i-postings/2]=tempint[i];
			}
			
		} else {
			decoder.decodeSingle(buffer, postings/2, docids, 0);
			SimpleStats.addDescription(4, 1, true);
		}
		
		for (int i=0; i<postings/2; i++) {
			docids[i] += refdocid;
			refdocid = docids[i];
		}
		
		this.chunkno = chunkno;
		iptr = 0;
		maxdocid = refdocid;
	}
	
	private void readFreqChunk(){
		decoder.decodeSingle(buffer, (chunkno < lastchunk) ? 128 : (lastposting + 1), freqs, 0);
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
		if (docid > maxdocid) {
			//iterate nextChunk until EOF or found
			while (docid > maxdocid) {
				if ( !readNextChunk()) return false;
			}
		}
		
		int postings = (chunkno < lastchunk) ? 128 : (lastposting + 1);
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
		int _lastposting = (chunkno < lastchunk) ? 127 : lastposting;
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
