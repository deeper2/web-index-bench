package nudt.experiment;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;

import nudt.buffering.BufferPool;
import nudt.structures.Index;
import nudt.structures.Statistics;
import nudt.structures.lexicon.LexiconEntry;
import nudt.structures.postinglist.DefaultPostingListInputStream;
import nudt.utils.SimpleStats;

/**
* The goal of this little program is to convert terrier docid
* indexes to flat index for C++ platform
*
* Terrier index format:
*
* Repeated :
*    32-bit unsigned integer indicating length n
*    a list of n 32-bit unsigned integers representing Doc IDs.
*
* Author : Kun Jiang
* Date: Mar. 2020
*/
public class LocalIndex2Flat {

	public static void main(String args[]) throws IOException, InterruptedException {
		SimpleStats.init("Candidates Inserted Into Heap", // 0 heap insert
				"Number Of Postings Scored", // 1 scoring function
				"Number Of Docids Evaluated", // 2 getting docid
				"Number Of Blocks onDisk Readed", // 3 block contains
				"Number Of Docid Chunks Decoded", // 4 lots of chunks
				"Number Of Freqs Chunks Evaluated", // 5 freq chunk now stored
													// together with 4
				"Number Of Sorting Operation");// 6 sort operation

		String inpath = "./index/";
		Index input_index = new Index(inpath);
		Statistics input_stats = input_index.getStatistics();
		int numterms = input_stats.getNumberOfUniqueTerms();
		//PFOR coded: make sure local index is compressed by right the same codec
		DefaultPostingListInputStream plis = input_index.getDefaultPostingListInputStream(numterms);
		//Simple-9 coded
		//DefaultPostingListInputStream plis = input_index.getDefaultPostingListInputStream(numterms);
		
		//BufferedWriter---character
		BufferedOutputStream buf = new BufferedOutputStream(new FileOutputStream("./index/gov2_flat_docid"));
		
		byte[] buftmp=new byte[4];
		for (int i = 0; i < numterms; i++) {
			LexiconEntry _lE = plis.nextEntry();
			int nt = _lE.getN_t();
			if(nt <= 16) continue;
			//LITTLE-ENDIAN
			buftmp[0]=(byte)(0xff & nt);
			buftmp[1]=(byte)(0xff & (nt>>>8));
			buftmp[2]=(byte)(0xff & (nt>>>16));
			buftmp[3]=(byte)(nt>>>24);
			buf.write(buftmp);
			
			for (int k = 0; k < nt; k++) {
				int docid = plis.getDocId();
				//LITTLE-ENDIAN
				buftmp[0]=(byte)(0xff & docid);
				buftmp[1]=(byte)(0xff & (docid>>>8));
				buftmp[2]=(byte)(0xff & (docid>>>16));
				buftmp[3]=(byte)(docid>>>24);
				buf.write(buftmp);
				plis.next();
			}
		}
		plis.close();
		buf.close();
		input_index.close();
		
		System.out.println("done converting index 2 flat!");
		
	}
}
