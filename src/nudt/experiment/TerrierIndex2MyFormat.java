package nudt.experiment;

import java.io.IOException;

import nudt.compression.partition.PostingListWriting4Partition;
import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.lexicon.LexiconOutputStream;
import nudt.structures.postinglist.DefaultPostingListWriting;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListIteratorPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimple;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimple2;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimplev;
import nudt.utils.Constants;

//import nudt.terrier.structures.Index;
//import nudt.terrier.structures.InvertedIndexInputStream;
//import nudt.terrier.structures.LexiconInputStream;

import uk.ac.gla.terrier.structures.Index;
import uk.ac.gla.terrier.structures.InvertedIndexInputStream;
import uk.ac.gla.terrier.structures.LexiconInputStream;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class TerrierIndex2MyFormat {
	public static void main(String args[]) throws IOException, InterruptedException{
		
		String inpath = "D:\\software\\terrier-2.2.1";
		String outpath ="./index";
		
		if (args.length>0){
			inpath = args[0];
			outpath= args[1];
		}
		System.setProperty("terrier.home", inpath);//默认位置不需要特殊说明
		//System.setProperty("terrier.var", inpath);//terrier-lite中改动了索引位置
		
		Index tIndex = Index.createIndex();
		LexiconInputStream lis = (LexiconInputStream)tIndex.getIndexStructureInputStream("lexicon");
		InvertedIndexInputStream iis = (InvertedIndexInputStream) tIndex.getIndexStructureInputStream("inverted");

		nudt.structures.Index lIndex = new nudt.structures.Index(outpath);
		Constants.USE_SKIPS = true;// can be set to false if you don't want to generate skipping structure
		Constants.DOCNO_BYTE_LENGTH = 20;
		Constants.STRING_BYTE_LENGTH= 40;
		Constants.MAX_NUMBER_OF_DOCUMENTS = tIndex.getCollectionStatistics().getNumberOfDocuments();
		
		DefaultPostingListWriting plos = lIndex.getDefaultPostingListOutputStream();//PFOR+Simple9
		//SimplePostingListWritingSkipSimple plos = lIndex.getSkipSimplePostingListOutputStream();
		//SimplePostingListWritingSkipSimple2 plos = lIndex.getSkipSimple2PostingListOutputStream();
	
		LexiconOutputStream los = lIndex.getLexiconOutputStream();
		Statistics stats = lIndex.getStatistics();
		
		while (lis.readNextEntry() > -1){
			String term = lis.getTerm();
			int nt = lis.getNt();//document frequency
			int tf = lis.getTF();//collection frequency
			int[][] scores = iis.getNextDocuments();//倒排链表
			//每个term对应的倒排链表进行索引转换，返回词典的一些信息并存储
			LexiconEntry lEntry;
			lEntry = plos.nextEntry(term, nt, tf, scores);
			los.nextEntry(lEntry);//词典
		}
		
		stats.setNumberOfDocuments(tIndex.getCollectionStatistics().getNumberOfDocuments());
		stats.setNumberOfTokens(los.getNumberOfTokens());
		stats.setNumberOfPointers(los.getNumberOfPointers());
		stats.setNumberOfUniqueTerms(los.getNumberOfTerms());
		
		//skipto
		plos.close();
		los.close();
		lIndex.close();
		
		//terrier
		lis.close();
		iis.close();
		tIndex.close();
	}
}
