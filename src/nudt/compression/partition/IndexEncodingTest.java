package nudt.compression.partition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.lexicon.LexiconOutputStream;
import nudt.structures.postinglist.DefaultPostingListWriting;
import nudt.utils.Constants;

//import nudt.terrier.structures.Index;
//import nudt.terrier.structures.InvertedIndexInputStream;
//import nudt.terrier.structures.LexiconInputStream;

import uk.ac.gla.terrier.structures.Index;
import uk.ac.gla.terrier.structures.InvertedIndexInputStream;
import uk.ac.gla.terrier.structures.LexiconInputStream;

/**
 * Loading terrier indexes, and testing the compression and ratio factors.
 * @author <a href="mailto:jk_365@126.com">Kun Jiang</a>
 * @version $Id $.
 */
public class IndexEncodingTest {
	public static void main(String args[]) throws IOException, InterruptedException{
		
		String inpath = "D:\\software\\terrier-2.2.1";
		String outpath ="./index4codectest";
		
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
		Constants.DOCNO_BYTE_LENGTH = 20;
		Constants.STRING_BYTE_LENGTH= 40;
		Constants.MAX_NUMBER_OF_DOCUMENTS = tIndex.getCollectionStatistics().getNumberOfDocuments();
		
		/*write an new DefaultPostingListWriting class with new codec, and declare it in Index class*/
		PostingListWriting4Partition plos = lIndex.getSimplePostingListOutputStream();
		LexiconOutputStream los = lIndex.getLexiconOutputStream();
		Statistics stats = lIndex.getStatistics();
		
		long beforeCompress = System.nanoTime()/1000;
		
		while (lis.readNextEntry() > -1){
			String term = lis.getTerm();
			int nt = lis.getNt();//document frequency
			int tf = lis.getTF();//collection frequency
			
			int[][] scores = iis.getNextDocuments();//倒排链表
			if (nt < 128)
				continue;
			//每个term对应的倒排链表进行索引转换，返回词典的一些信息并存储
			LexiconEntry lEntry;
			lEntry = plos.nextEntry(term, nt, tf, scores);//various coding
			los.nextEntry(lEntry);//词典
			
		}
		
		stats.setNumberOfDocuments(tIndex.getCollectionStatistics().getNumberOfDocuments());
		stats.setNumberOfTokens(los.getNumberOfTokens());
		stats.setNumberOfPointers(los.getNumberOfPointers());
		stats.setNumberOfUniqueTerms(los.getNumberOfTerms());
		stats.setCodecName(plos.getCodecName());
		
		plos.close();
		los.close();
		lIndex.close();
		
		//terrier
		lis.close();
		iis.close();
		tIndex.close();
		
		long afterCompress = System.nanoTime()/1000 ;
		long compressTime = afterCompress - beforeCompress;
		System.out.println("time consumed: "+compressTime+"(s)");
		
		Properties indexProperties = new Properties();

		indexProperties.load(new FileInputStream(outpath + "/index.properties"));
		long pointers = Long.parseLong(indexProperties.getProperty("index.numberOfPointers"));
		float misvalue= (float) (pointers * 2)/compressTime;
		System.out.println("mis is " + misvalue);
		
		Player.stop_play();
	}
}
