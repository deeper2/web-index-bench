package nudt.experiment;

import java.io.IOException;

import nudt.compression.partition.PostingListIterator4Partition;
import nudt.structures.Statistics;
import nudt.structures.lexicon.Lexicon;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.lexicon.LexiconOutputStream;
import nudt.structures.postinglist.DefaultPostingListIterator;
import nudt.structures.postinglist.DefaultPostingListWriting;
import nudt.structures.postinglist.DiskInvertedIndex;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimple;
import nudt.utils.Constants;
import nudt.utils.SimpleStats;

/**
 * Loading on-disk indexes, and decoding inverted lists
 * testing the decompression performance with criteria:
 * millions of integers (docid and freq) per second (mis).
 */
public class LocalIndexRecodingTest {
	public static void main(String args[]) throws IOException, InterruptedException{
		
		SimpleStats.init("Candidates Inserted Into Heap",	//0 heap insert
				 "Number Of Postings Scored",		        //1 scoring function
				 "Number Of Docids Evaluated",		        //2 getting docid
				 "Number Of Blocks onDisk Readed",          //3 block contains
				 "Number Of Docid Chunks Decoded",          //4 lots of chunks		
				 "Number Of Freqs Chunks Evaluated");       //5 freq chunk
		
		String inpath ="./index4codectest";
		String outpath ="./index4codectest/recoded";
		if (args.length>0){
			outpath= args[1];
		}
		
		nudt.structures.Index iIndex = new nudt.structures.Index(inpath);
		nudt.structures.Index oIndex = new nudt.structures.Index(outpath);
		Constants.DOCNO_BYTE_LENGTH = 20;
		Constants.STRING_BYTE_LENGTH= 40;
	
		Statistics istats = iIndex.getStatistics();
		Statistics ostats = oIndex.getStatistics();
		int termNo=istats.getNumberOfUniqueTerms();
		Lexicon lis = iIndex.getLexicon(termNo);
		DiskInvertedIndex plis = iIndex.getInvertedIndex();
		
		/*write an new DefaultPostingListWriting class with new codec, and declare it in Index class*/
		SimplePostingListWritingSkipSimple plos = oIndex.getSkipSimplePostingListOutputStream();
		LexiconOutputStream los = oIndex.getLexiconOutputStream();

		int tn=0;
		while (tn <termNo){
			LexiconEntry _lE = lis.lookup(tn++);
			//loading 
			PostingListIterator4Partition iterators = plis.getPostingListIterator(_lE);
			String term = _lE.getTerm();
			int nt = _lE.getN_t();//document frequency:posting list length
			int tf = _lE.getTF();//collection frequency:all terms occurrence number
			int[][] scores = new int[2][nt];//倒排链表
			//每个term对应的倒排链表进行索引转换，返回词典的一些信息并存储
			int pi=0;
			while (true) {
				scores[0][pi] = iterators.getDocId();
				scores[1][pi++]= iterators.getFrequency();				
				if (!iterators.next()) break;
			}
			iterators.close();
			
			//various coding
			LexiconEntry lEntry= plos.nextEntry(term, nt, tf, scores);//倒排链表;
			los.nextEntry(lEntry);//词典
		}
		ostats.setNumberOfDocuments(istats.getNumberOfDocuments());
		ostats.setNumberOfTokens(los.getNumberOfTokens());
		ostats.setNumberOfPointers(los.getNumberOfPointers());
		ostats.setNumberOfUniqueTerms(los.getNumberOfTerms());
		
		plos.close();
		los.close();
		oIndex.close();
		
		lis.close();
		iIndex.close();
	}
}
