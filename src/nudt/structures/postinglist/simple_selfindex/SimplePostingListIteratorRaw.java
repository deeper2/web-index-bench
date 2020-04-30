package nudt.structures.postinglist.simple_selfindex;

import nudt.query.scoremodels.BM25;
import nudt.structures.BufferWrapper;
import nudt.structures.docinfo.FastDocLength;
import nudt.utils.Constants;
import nudt.utils.SimpleStats;

/**
 * no skip, no compression
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class SimplePostingListIteratorRaw{
	
	private BufferWrapper buffer;
		
	private int[] docids;
	private int[] freqs;
	private int iptr = 0,maxdocid;
	private int lastposting; 
	
	private long startOffset;
	public SimplePostingListIteratorRaw(BufferWrapper buffer, int nt, long startOffset){
		this.buffer = buffer;
		this.docids = new int[nt];
		this.freqs = new int[nt];
		lastposting = nt-1;
		this.startOffset = startOffset;
		buffer.position(startOffset);
		
		//decode the all blocks
		readChunk();
	}
		
	/**
	 * Read a chunk from the buffer (assumed that the pointer is aligned)
	 * @param refdocid reference DocId
	 * @param chunkno sequential chunk number
	 */
	private void readChunk(){
		int postings = lastposting; 

		//decoder.decodeSingle(buffer, postings, docids, 0);
		buffer.getInt(docids, 0, postings);
		buffer.getInt(freqs, 0, postings);
		//decoder.decodeSingle(buffer, postings, tempint, 0);
		SimpleStats.addDescription(4, 2, true);
		SimpleStats.addDescription(4, 1, true);
			
		int refdocid=0;
		for (int i=0; i<postings/2; i++) {
			docids[i] += refdocid;
			refdocid = docids[i];
		}
		iptr = 0;
		maxdocid = refdocid;
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
				return false;	
		}
		
		for (; iptr<lastposting + 1; iptr++){
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
		if (iptr < lastposting){
			iptr++;
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
		try {
			return docids[iptr];
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * returns current frequency
	 * @return
	 */
	public final int getFrequency(){
		
		return freqs[iptr];
	}

	public void close() {
		buffer.close();
	}
	
	public void reset() {
		buffer.position(startOffset);
		//decode the first block itself
		readChunk();
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
		return wmodel.score(freqs[iptr], FastDocLength.getNumberOfTokens(docids[iptr]), precomputed);
	}
	
}
