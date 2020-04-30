package nudt.experiment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import nudt.query.Query;
import nudt.query.QueryResults;
import nudt.query.QueryResultsIterator;
import nudt.query.preprocessing.QueryPreprocessing;
import nudt.query.processing.QueryProcessing;
import nudt.query.processing.AND_DAAT_DOCIDS_ONLY_QueryProcessing;
import nudt.query.processing.AND_DAAT_QueryProcessing;
import nudt.structures.Index;
import nudt.structures.Statistics;
import nudt.utils.Constants;
import nudt.utils.SimpleStats;

/**
 * @author <a href="mailto:jiangkun@nudt.edu.cn">Kun Jiang</a>
 * @version $Id $.
 */
public class PerformaceTest {
	
	public static void main(String[] args) throws IOException{
		SimpleStats.init("Candidates Inserted Into Heap",	//0 heap insert
				 "Number Of Postings Scored",		        //1 scoring function
				 "Number Of Docids Evaluated",		        //2 getting docid
				 "Number Of Blocks onDisk Readed",          //3 block contains
				 "Number Of Docid Chunks Decoded",          //4 lots of chunks		
				 "Number Of Freqs Chunks Evaluated");       //5 freq chunk

		Index index = null;
		Statistics stats = null;
		QueryPreprocessing preproc = null;
		QueryProcessing proc = null;
		
		if (args.length == 0) {
			args = new String[3];
			args[0] = "10";//Top-k number
			args[1] = "1";//Selecting test case;0 single---1 whole
		}
		
		Constants.BUFFER_BLOCK_SIZE = 16*1024;
		Constants.MAX_NUMBER_OF_RESULTS = Integer.parseInt(args[0]);
		System.out.println("TOP K=" + args[0]);
		Constants.USE_SKIPS = true;
		index = new Index("./index");
		stats = index.getStatistics();
		index.loadFastDocLengths(stats.getNumberOfDocuments());		
		preproc = new QueryPreprocessing(index.getLexicon(stats.getNumberOfUniqueTerms()));//若无doc文件,则生成
		proc = new AND_DAAT_QueryProcessing(index.getSInvertedIndex(), stats);//getInvertedIndex
		//proc = new AND_DAAT_DOCIDS_ONLY_QueryProcessing(index.getSInvertedIndex(), stats);
				
		int testcode = Integer.parseInt(args[1]);//runWholeTest
		switch (testcode) {
			case 0:
				runSingleTest(preproc, proc);
				break;
			case 1:
				runWholeTest(preproc, proc, 2000);
				break;
		}
		index.close();
	}
	
	public static void runWholeTest(QueryPreprocessing preproc, QueryProcessing proc, int count) throws IOException{
		BufferedReader querylogReader = new BufferedReader(new FileReader("./query/and_queries"));
//		BufferedWriter bw= new BufferedWriter(new FileWriter("./query/and_queries"));
//		StringBuffer queryl = new StringBuffer();
		
		String querystr;
		Query query;
		QueryResults results;
		long start, end;
		long totaltime = 0;
		for (int i=0; i<count; i++){
			querystr = querylogReader.readLine();
			if (i%1000 == 0) System.out.println(i);
			System.out.println(i+" "+querystr);
			
			query = preproc.preprocessQuery(querystr);
			if(query==null) continue;
			start = System.currentTimeMillis();
			results=proc.processQuery(query);
			end = System.currentTimeMillis();
			totaltime += end - start;
		//	System.out.println("done");
			
//			if(results.getNumberOfResults()>1)
//				queryl.append(querystr + "\n");
			
			System.out.println(results.getNumberOfResults());
//			QueryResultsIterator resIter = new QueryResultsIterator(results);	
//			System.out.println(results.getNumberOfResults() +" out of " + results.getRealNumberOfResults());
//			int j=0;
//			while (resIter.next()){
//				System.out.println(j++ + " " + resIter.getDocId() + " " + resIter.getScore());
//			}
			
		}
//		bw.write(queryl.toString());
//		bw.close();
		
		//System.out.println("average time " + (double)totaltime);
		System.out.println("average time " + (double)totaltime / ( count));
		//System.out.println(SimpleStats.getString());
		querylogReader.close();
	}
	
	public static void runSingleTest(QueryPreprocessing preproc, QueryProcessing proc){		
		String querystr = "alltheweb be";
		//querystr = "modesto bee";
		Query query;
		QueryResults results;
		long start, end;
		long totaltime = 0;
		
		System.out.println(querystr);
		query = preproc.preprocessQuery(querystr);		

		start = System.currentTimeMillis();
		results = proc.processQuery(query);
		end = System.currentTimeMillis();
		totaltime += end - start;
			
		QueryResultsIterator resIter = new QueryResultsIterator(results);
		System.out.println(results.getNumberOfResults() +" out of " + results.getRealNumberOfResults());
		int j=0;
		while (resIter.next()){
			System.out.println(j++ + " " + resIter.getDocId() + " " + resIter.getScore());
		}
		System.out.println("time " + (double)totaltime / (1000));	
	}
}
