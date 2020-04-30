package nudt.query;


/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class QueryResults {
	protected int docids[];
	protected double scores[];
	protected int numberOfResults;
	protected int realNumberOfResults;
	
	public QueryResults(int[] docids, double[] scores, int numberOfResults, int realNumberOfResults){
		this.docids = docids;
		this.scores = scores;
		this.numberOfResults = numberOfResults;
		this.realNumberOfResults = realNumberOfResults;
	}
	
	public final int[] getDocids(){
		return docids;
	}
	
	public final double[] getScores(){
		return scores;
	}
	
	public final int getNumberOfResults(){
		return numberOfResults;
	}
	
	public final int getRealNumberOfResults(){
		return realNumberOfResults;
	}
}
