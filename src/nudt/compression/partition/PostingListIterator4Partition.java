package nudt.compression.partition;

import nudt.compression.NewPForEncoding;
import nudt.query.scoremodels.BM25;
import nudt.structures.BufferWrapper;
import nudt.structures.docinfo.FastDocLength;
import nudt.utils.SimpleStats;

/**
 * @author <a href="mailto:jk_365@126.com">Kun Jiang</a>
 * @version $Id $.
 */
public class PostingListIterator4Partition{
	
	private BufferWrapper buffer;
	
	//private byte[] docfre;//afor vse
	private long[] docfre;//simple8b(1/3)
	//private int[] docfre;//simple9
	
	private int[] docids;
	private int[] freqs;
	private int iptr = 0,maxdocid;
	private int lastposting; 
	private int endOffset;

	//private OldSimple9_F coder;
	//private OptSimple9_F coder;
	//private OldSimple16_F coder;
	//private OptSimple16_F coder;
	//private OldSimple8b_F coder;
	//private OptSimple8b_F coder;
	
	//private OldSimple9 coder;
	//private OptSimple9 coder;
	//private OldSimple16 coder;
	//private OptSimple16 coder;
	//private OldSimple8b coder;
	//private OptSimple8b coder;
	private OPTWAP coder;
	
	//private AFOR2 coder;
	//private VSEBlock coder;
	//private VSENaive coder;
	//private VSESimple coder;
	//private OptP4D_R coder;
	
	public String getCodecName(){
		return coder.getClass().getSimpleName();
	}
	
	public PostingListIterator4Partition(BufferWrapper buffer, int nt, int endOffset){
		this.buffer = buffer;
		//very important for codecs that coded more number at the end of a posting list
		//thus, the iterator has a 1024 0s at the end of its docids and freqs arrays
		this.docids = new int[nt+1024];//int[nt+27] if necessary?(1/1)
		this.freqs = new int[nt+1024];//int[nt+27] if necessary?(1/1)
		
		this.docfre =new long[nt*2+64];//simple8b(2/3)
		//this.docfre =new int[nt*2];//simple9
		//this.docfre =new byte[nt*8+128];//afor: assume 4bytes for a integer(too much)
		
		lastposting = nt-1;
		buffer.position(0);
		this.endOffset=endOffset;
		
		//coder = new OldSimple9_F();
		//coder = new OptSimple9_F();
		//coder = new OldSimple16_F();
		//coder = new OptSimple16_F();
		//coder = new OldSimple8b_F();
		//coder = new OptSimple8b_F();
		
		//coder = new OldSimple9();
		//coder = new OptSimple9();
		//coder = new OldSimple16();
		//coder = new OptSimple16();
		//coder = new OldSimple8b();
		//coder = new OptSimple8b();
		coder = new OPTWAP();
		
		//coder = new AFOR2();
		//coder = new VSEBlock();
		//coder = new VSENaive();
		//coder = new VSESimple();
		//coder = new OptP4D_R();
		
		readChunk(endOffset);//decode the all blocks
	}
		
	/**
	 * Read a chunk from the buffer (assumed that the pointer is aligned)
	 * @param refdocid reference DocId
	 * @param chunkno sequential chunk number
	 */
	private void readChunk(int endOffset){
		int postings = lastposting; 

		//buffer.get(docfre, 0, endOffset);//afor vse
		//buffer.getInt(docfre, 0, endOffset>>2);//>>2 means byte to int num simple9
		buffer.getLong(docfre, 0, endOffset>>3);//>>3 means byte to long num simple8b(3/3)
		
		coder.decode(docfre, docids, freqs, postings);

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
		buffer.position(0);
		//decode the first block itself
		readChunk(endOffset);
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
