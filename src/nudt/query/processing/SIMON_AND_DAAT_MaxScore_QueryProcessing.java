package nudt.query.processing;

import nudt.query.Query;
import nudt.query.QueryEntry;
import nudt.query.QueryResults;
import nudt.query.processing.QueryProcessing;
import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.postinglist.DefaultPostingListIterator;
import nudt.structures.postinglist.DiskInvertedIndex;



/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class SIMON_AND_DAAT_MaxScore_QueryProcessing extends QueryProcessing{
	
	public SIMON_AND_DAAT_MaxScore_QueryProcessing(DiskInvertedIndex index, Statistics stats){
		super(index, stats);
	}
	
	public QueryResults processQuery(Query query){
		rheap.reset();
		QueryEntry qEntries[] = query.getEntries();
		
		int numTerms = qEntries.length;
		if (numTerms == 0) return new QueryResults(null, null, 0, 0);

		//double maxKeyFreq = query.getMaxKeyFrequency();
		double numOfDocs = stats.getNumberOfDocuments();
		double avgDocLength = stats.getAverageDocumentLength();
		DefaultPostingListIterator iterators[] = new DefaultPostingListIterator[numTerms];
		//double maxScores[] = new double[numTerms];
		double accScores[] = new double[numTerms];
		double _accScore = 0.0d, _kf;
		
		QueryEntry _qE; LexiconEntry _lE;
		for (int i=0; i<numTerms; i++){
			_qE = qEntries[i];
			_lE = _qE.getLexiconEntry();
			iterators[i] = (DefaultPostingListIterator) index.getDefaultPostingListIterator(_lE);
			_kf = 1.0;//_qE.getKeyFrequency()/maxKeyFreq;
			//maxScores[i] = FastMaxScore.getMaxScore(_lE.getTermId(), _kf);
			iterators[i].prepareForScoringwithMaxScore(_kf, _lE.getTermId(), _lE.getN_t(), _lE.getTF(), numOfDocs, avgDocLength);		
		}
		
		//Arrays.sort(iterators, DESCENDINGMAXSCORE);		
		for (int i = numTerms - 1; i >= 0; i--){
			_accScore += iterators[i].maxScore;
			accScores[i] = _accScore;
		}

		int numberOfResults = 0;
		int doc, _doc, i; double score, reqScore = 0.0d;
		
loop:  while (true) {
			doc = iterators[0].getDocId();
			score = iterators[0].getScore();
		
			for (i = 1; i < numTerms; i++){
				if (score + accScores[i] < reqScore) break;			
				if (!iterators[i].skipTo(doc)) break loop;			
				_doc = iterators[i].getDocId();
				if (_doc > doc) {
					if (iterators[0].skipTo(_doc)) continue loop;
					else break loop;
				}
				score += iterators[i].getScore();
			}			
		
			if (i==numTerms && rheap.insertIfGreaterThanLeast(doc, score)){
				reqScore = rheap.minScore();
			}
			
			if (!iterators[0].next()) break loop;
		}
		
		for (i=0; i<numTerms; i++) iterators[i].close();
		
		numberOfResults = rheap.size();
		int resdocids[] = new int[numberOfResults];
		double resscores[] = new double[numberOfResults];
		rheap.decrSortResults(resdocids, resscores);
		return new QueryResults(resdocids, resscores, numberOfResults, numberOfResults);
	}
}