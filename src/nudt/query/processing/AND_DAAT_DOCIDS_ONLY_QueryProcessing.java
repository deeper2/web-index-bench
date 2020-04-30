package nudt.query.processing;

import java.util.Arrays;

import nudt.compression.partition.PostingListIterator4Partition;
import nudt.query.Query;
import nudt.query.QueryEntry;
import nudt.query.QueryResults;
import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.postinglist.DefaultPostingListIterator;
import nudt.structures.postinglist.DiskInvertedIndex;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorSkipSimple2;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class AND_DAAT_DOCIDS_ONLY_QueryProcessing extends QueryProcessing{
	
	public AND_DAAT_DOCIDS_ONLY_QueryProcessing(DiskInvertedIndex index, Statistics stats){
		super(index, stats);
		docids = new int[stats.getNumberOfDocuments()];
	}

	private int[] docids; 
	public QueryResults processQuery(Query query){
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
			//iterators[i] = (DefaultPostingListIterator) index.getDefaultPostingListIterator(_lE);
			iterators[i] = (PostingListIterator4Partition) index.getPostingListIterator(_lE);
			_kf = ((double)_qE.getKeyFrequency())/maxKeyFreq;
			iterators[i].prepareForScoring(_kf, _lE.getN_t(), _lE.getTF(), numOfDocs, avgDocLength);
		}
				
		int numberOfResults = 0;
		int doc, _doc, i;
		
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
			docids[numberOfResults++] = doc;
			if (!iterators[0].next()) break loop;
		}
		
		for (i=0; i<numTerms; i++) iterators[i].close();	
		int resdocids[] = Arrays.copyOf(docids, numberOfResults);
		double resscores[] = null;
	
		return new QueryResults(resdocids, resscores, numberOfResults, numberOfResults);
	}
}