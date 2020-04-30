package nudt.compression.partition;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
 * @author <a href="mailto:jk_365@126.com">Kun Jiang</a>
 * @version $Id $.
 */
public class IndexDecodingTest {
	public static void main(String args[]) throws IOException, InterruptedException{
		
		SimpleStats.init("Candidates Inserted Into Heap",	//0 heap insert
				 "Number Of Postings Scored",		        //1 scoring function
				 "Number Of Docids Evaluated",		        //2 getting docid
				 "Number Of Blocks onDisk Readed",          //3 block contains
				 "Number Of Docid Chunks Decoded",          //4 lots of chunks		
				 "Number Of Freqs Chunks Evaluated");       //5 freq chunk
		
		String inpath ="./index4codectest";
		
		nudt.structures.Index iIndex = new nudt.structures.Index(inpath);
		Constants.DOCNO_BYTE_LENGTH = 20;
		Constants.STRING_BYTE_LENGTH= 40;
		//int totalSize=iIndex.getStatistics();
		Statistics istats = iIndex.getStatistics();
		int termNo=istats.getNumberOfUniqueTerms();
		Lexicon lis = iIndex.getLexicon(termNo);
		DiskInvertedIndex plis = iIndex.getSInvertedIndex();
		
		int tn=0;
		long beforedeCompress = System.nanoTime()/1000;
		while (tn <termNo){
			LexiconEntry _lE = lis.lookup(tn++);
			//loading 
			PostingListIterator4Partition iterators = plis.getPostingListIterator(_lE);
			if(!iterators.getCodecName().equals(Constants.CODEC_NAME)){
				System.err.println("codec error!");
				break;
			}
			
			int nt = _lE.getN_t();//document frequency:posting list length
			int[][] scores = new int[2][nt];//倒排链表
			//每个term对应的倒排链表进行索引转换，返回词典的一些信息并存储
			int pi=0;
			while (true) {
				scores[0][pi] = iterators.getDocId();
				scores[1][pi++]= iterators.getFrequency();				
				if (!iterators.next()) break;
			}
			iterators.close();
			if(tn%100000==0)
				System.out.println(tn+"/"+termNo);
		}
		long afterdeCompress = System.nanoTime()/1000 ;
		long decompressTime = afterdeCompress - beforedeCompress;
		lis.close();
		iIndex.close_only();
		System.out.println("time consumed: "+decompressTime+"(s)");
		
		Properties indexProperties = new Properties();

		indexProperties.load(new FileInputStream(inpath + "/index.properties"));
		long pointers = Long.parseLong(indexProperties.getProperty("index.numberOfPointers"));
		float misvalue= (float) (pointers * 2)/decompressTime;
		System.out.println("mis is " + misvalue);
		
		Player.stop_play();
	}
}
