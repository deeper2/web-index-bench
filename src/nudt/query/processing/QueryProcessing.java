package nudt.query.processing;

import nudt.query.Query;
import nudt.query.QueryResults;
import nudt.query.ResultHeap;
import nudt.query.scoremodels.BM25;
import nudt.query.scoremodels.WeightingModel;
import nudt.structures.Statistics;
import nudt.structures.postinglist.DiskInvertedIndex;
import nudt.utils.Constants;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public abstract class QueryProcessing {
	
	protected DiskInvertedIndex index;
	protected ResultHeap rheap;
	protected WeightingModel wmodel;
	protected Statistics stats;
	
	public long accScoreTime = 0l, procLoopTime = 0l;
	public int numQueries = 0;
	
	//declaration
	public QueryProcessing(DiskInvertedIndex index, Statistics stats){
		this.index = index;
		wmodel = new BM25();
		wmodel.setAverageDocumentLength(stats.getAverageDocumentLength());
		wmodel.setNumberOfDocuments(stats.getNumberOfDocuments());
		this.stats = stats;
		
		rheap = new ResultHeap(Constants.MAX_NUMBER_OF_RESULTS);
	}
	
	public abstract QueryResults processQuery(Query query);	
}
