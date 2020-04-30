package nudt.query.processing;

import nudt.compression.partition.PostingListIterator4Partition;
import nudt.query.Query;
import nudt.query.QueryEntry;
import nudt.query.QueryResults;
import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.postinglist.DefaultPostingListIterator;
import nudt.structures.postinglist.DiskInvertedIndex;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipSimple;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipSimple2;

//纯粹AND_DAAT中，因为没有使用maxscore，所以都是将所有符合AND条件的结果进行最终打分结果排序得到的k个结果
//这样自索引结构可能没有太多意义，因为符合AND条件的结果太多了,只是最终选择了得分高的k个结果
//解决办法：1.使用maxscore,2.限制为多个词的查询
/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class AND_DAAT_QueryProcessing extends QueryProcessing{
	
	public AND_DAAT_QueryProcessing(DiskInvertedIndex index, Statistics stats){
		super(index, stats);
	}
		
	public QueryResults processQuery(Query query){
		rheap.reset();
		QueryEntry qEntries[] = query.getEntries();
		
		int numTerms = qEntries.length;
		if (numTerms == 0) return new QueryResults(null, null, 0, 0);

		double maxKeyFreq = query.getMaxKeyFrequency();
		double numOfDocs = stats.getNumberOfDocuments();
		double avgDocLength = stats.getAverageDocumentLength();
		//DefaultPostingListIterator iterators[] = new DefaultPostingListIterator[numTerms];
		PostingListIterator4Partition iterators[] = new PostingListIterator4Partition[numTerms];		
		double _kf;
		
		QueryEntry _qE; LexiconEntry _lE;
		for (int i=0; i<numTerms; i++){
			_qE = qEntries[i];
			_lE = _qE.getLexiconEntry();
			//iterators[i] = (SimplePostingListIteratorSimple) index.getDefaultPostingListIterator(_lE);
			iterators[i] = (PostingListIterator4Partition) index.getPostingListIterator(_lE);
			_kf = ((double)_qE.getKeyFrequency())/maxKeyFreq;
			iterators[i].prepareForScoring(_kf, _lE.getN_t(), _lE.getTF(), numOfDocs, avgDocLength);
		}
				
		int numberOfResults = 0;
		int doc, _doc, i; double score;
		
loop:  while (true) {
			doc = iterators[0].getDocId();

			for (i = 1; i < numTerms; i++){
				if (!iterators[i].skipTo(doc)) break loop;
				
				_doc = iterators[i].getDocId();
				if (_doc > doc) {
					if (iterators[0].skipTo(_doc)) continue loop;
					else break loop;
				}
			}			
		
			score = 0.0d;
			for (i = 0; i < numTerms; i++) score += iterators[i].getScore();				
			rheap.insertIfGreaterThanLeast(doc, score);
			
			if (!iterators[0].next()) break loop;
		}
		
		for (i=0; i<numTerms; i++) iterators[i].close();
		
		numberOfResults = rheap.size();
		int resdocids[] = new int[numberOfResults];
		double resscores[] = new double[numberOfResults];
		rheap.decrSortResults(resdocids, resscores);
		System.out.println("numberofresult "+ numberOfResults);
		return new QueryResults(resdocids, resscores, numberOfResults, numberOfResults);
	}
}