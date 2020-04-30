package nudt.experiment;

import java.io.IOException;

import nudt.utils.BitUtils;
import uk.ac.gla.terrier.structures.Index;
import uk.ac.gla.terrier.structures.InvertedIndexInputStream;
import uk.ac.gla.terrier.structures.LexiconInputStream;

/**
 * 统计d-gap的分布
 */
public class DGapDistribution {

	public static void main(String[] args) throws IOException {
		String inpath = "D:\\software\\terrier-2.2.1";
		//String inpath2 = "D:\\software\\gov2-index";
		
		if (args.length>0){
			inpath = args[0];
		}
		System.setProperty("terrier.home", inpath);//默认位置不需要特殊说明
		//System.setProperty("terrier.var", inpath2);//terrier-lite中改动了索引位置
		
		Index tIndex = Index.createIndex();
		LexiconInputStream lis = (LexiconInputStream)tIndex.getIndexStructureInputStream("lexicon");
		InvertedIndexInputStream iis = (InvertedIndexInputStream) tIndex.getIndexStructureInputStream("inverted");
	
		int[] hist = new int[32];//data数组中各个数字采用不同位宽的累计
		int[] histnt = new int[32];//data数组中各个数字采用不同位宽的累计
		while (lis.readNextEntry() > -1){
			String term = lis.getTerm();
//			if(term.equals("pink"))
//				System.out.println();
			int nt = lis.getNt();//document frequency
			//int tf = lis.getTF();//collection frequency
			int[][] scores = iis.getNextDocuments();//倒排链表
			int[] dgaps=new int[nt];
			dgaps[0]=scores[0][0];
			for (int i = 1; i < nt; i++) {
				dgaps[i]=scores[0][i]-scores[0][i-1];
			}
			
			//System.out.println();
//			for (int i=0; i<dgaps.length; i++)
			for (int i=1; i<dgaps.length; i++){
				//hist索引+1是二进制表示的位数, log_2(9)=4
				hist[BitUtils.MSB(dgaps[i])+1]++;
				histnt[BitUtils.MSB(nt)]++;
			}
			

		}
		for(int i=0; i<hist.length; i++){
			System.out.println(i+"  "+hist[i]);
		}
		for(int i=0; i<hist.length; i++){
			System.out.println(i+"  "+histnt[i]);
		}
		//terrier
		lis.close();
		iis.close();
		tIndex.close();

	}


}
