package nudt.structures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Properties;

import nudt.buffering.BufferPool;
import nudt.compression.partition.PostingListWriting4Partition;
import nudt.structures.docinfo.DocInfo;
import nudt.structures.docinfo.DocInfoInputStream;
import nudt.structures.docinfo.DocInfoOutputStream;
import nudt.structures.docinfo.FastDocLength;
import nudt.structures.lexicon.Lexicon;
import nudt.structures.lexicon.LexiconInputStream;
import nudt.structures.lexicon.LexiconOutputStream;
import nudt.structures.postinglist.DiskInvertedIndex;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipPFOR;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipRaw;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimple;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimple2;
import nudt.structures.postinglist.simple_selfindex.SimplePostingListWritingSkipSimplev;
import nudt.structures.postinglist.DefaultPostingListInputStream;
import nudt.structures.postinglist.DefaultPostingListWriting;
import nudt.utils.Closeable;
import nudt.utils.Constants;


/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 * for all the indexes including lexicon, posting lists and docdic
 * index i/o
 */
public class Index implements Closeable{
	protected String path;
	protected Statistics stats;
	protected Properties indexProperties;
	
	protected HashMap<String, Integer> fileNumberCache = new HashMap<String, Integer>();
	protected BufferPool pool;
	
	public Index(String path){
		this.path = path;
		pool = new BufferPool(Constants.TOTAL_BUFFER_BLOCK_SIZE / Constants.BUFFER_BLOCK_SIZE, Constants.BUFFER_BLOCK_SIZE);
		pool.start();
		
		//load statistics
		indexProperties = new Properties();
		try {
			indexProperties.load(new FileInputStream(path + "/index.properties"));
			stats = new Statistics(
				Integer.parseInt(indexProperties.getProperty("index.numberOfDocuments", "0")),
				Integer.parseInt(indexProperties.getProperty("index.numberOfUniqueTerms", "0")),
				Long.parseLong(indexProperties.getProperty("index.numberOfPointers", "0")),
				Long.parseLong(indexProperties.getProperty("index.numberOfTokens", "0")));
			
			Constants.USE_SKIPS = Boolean.parseBoolean(
					indexProperties.getProperty("index.useSkips",""+Constants.USE_SKIPS));
			Constants.STRING_BYTE_LENGTH = Integer.parseInt(
					indexProperties.getProperty("index.maxTermLength",""+Constants.STRING_BYTE_LENGTH));
			Constants.DOCNO_BYTE_LENGTH = Integer.parseInt(
					indexProperties.getProperty("intdex.maxDocnoLength",""+Constants.DOCNO_BYTE_LENGTH));
			Constants.WORKERS_CNT = Integer.parseInt(indexProperties.getProperty("workerscnt",""+Constants.WORKERS_CNT));
			Constants.CODEC_NAME = indexProperties.getProperty("index.codecName");
		} catch (FileNotFoundException e) {
			stats = new Statistics(0, 0, 0, 0);
		} catch (IOException e) {
			e.printStackTrace();
			stats = new Statistics(0, 0, 0, 0);
		}
	}
	
	public Integer getFileNumber(String filename){
		Integer fileNumber = fileNumberCache.get(filename);
		if (fileNumber!=null) return fileNumber;
		
        try {
    	    File file = new File(filename);
    	    file.createNewFile();
            FileChannel indexChannel = new RandomAccessFile(file, "rw").getChannel();
			fileNumber = pool.registerFile(indexChannel, file);
			fileNumberCache.put(filename, fileNumber);
			return fileNumber;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	/*
	 * Statistics 
	 */
	public Statistics getStatistics(){
		return stats;
	}
	
	public void setStatistics(Statistics newStats){
		stats = newStats;
	}

	
	/*
	 * Lexicon Structures
	 */
	public Lexicon getLexicon(int totEntries){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.lex"));
			return new Lexicon(buffer, totEntries);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public LexiconOutputStream getLexiconOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.lex"));
			return new LexiconOutputStream(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * DocDict Structures
	 */
	
	public DocInfoInputStream getDocDictInputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.doc"));
			return new DocInfoInputStream(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public DocInfoOutputStream getDocDictOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.doc"));
			return new DocInfoOutputStream(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	public void loadFastDocLengths(int totEntries){
		FastDocLength.setLengths(totEntries, getDocDictInputStream());
	}
	
	/**
	 * Inverted Index:
	 * index.inv
	 */
	public DiskInvertedIndex getInvertedIndex(){
		return new DiskInvertedIndex(pool, getFileNumber(path+"/index.inv"));
	}//index input
	
	/**
	 * index.invn
	 */
	public DiskInvertedIndex getSInvertedIndex(){
		return new DiskInvertedIndex(pool, getFileNumber(path+"/index.invn"));//simple index
	}//index input
	
	public DefaultPostingListWriting getDefaultPostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.inv"));
			return new DefaultPostingListWriting(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//index output
	
	public PostingListWriting4Partition getSimplePostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new PostingListWriting4Partition(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw
	
	public SimplePostingListWritingSkipSimple getSkipSimplePostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new SimplePostingListWritingSkipSimple(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw
	
	public SimplePostingListWritingSkipSimple2 getSkipSimple2PostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new SimplePostingListWritingSkipSimple2(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw

	public SimplePostingListWritingRaw getRawPostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new SimplePostingListWritingRaw(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw
	
	public SimplePostingListWritingSkipRaw getSkipRawPostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new SimplePostingListWritingSkipRaw(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw
	
	public SimplePostingListWritingSkipPFOR getPFORPostingListOutputStream(){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.invn"));
			return new SimplePostingListWritingSkipPFOR(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}//simple index output raw
	
	public DefaultPostingListInputStream getDefaultPostingListInputStream(int totEntries){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.inv"));
			return new DefaultPostingListInputStream(buffer, getLexiconInputStream(totEntries));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public LexiconInputStream getLexiconInputStream(int totEntries){
		try {
			BufferWrapper buffer = new FileWrapper(pool, getFileNumber(path+"/index.lex"));
			return new LexiconInputStream(buffer, totEntries);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/*
	 * Store statistics
	 */
	protected void storeStatsAndSettings(){		
		indexProperties.setProperty("index.numberOfDocuments", ""+stats.getNumberOfDocuments());
		indexProperties.setProperty("index.numberOfUniqueTerms", ""+stats.getNumberOfUniqueTerms());
		indexProperties.setProperty("index.numberOfPointers", ""+stats.getNumberOfPointers());
		indexProperties.setProperty("index.numberOfTokens", ""+stats.getNumberOfTokens());
		indexProperties.setProperty("index.useSkips",""+Constants.USE_SKIPS);
		indexProperties.setProperty("index.maxTermLength",""+Constants.STRING_BYTE_LENGTH);
		indexProperties.setProperty("index.maxDocnoLength",""+Constants.DOCNO_BYTE_LENGTH);
		indexProperties.setProperty("index.codecName",""+stats.getCodecName());
		try {
			indexProperties.store(new FileOutputStream(path + "/index.properties"),"");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public Properties getIndexProperties(){
		return indexProperties;
	}
	
	public String getPath() {
		return path;
	}
	
	@Override
	public void close() {
		storeStatsAndSettings();
		pool.stop();
	}
	
	public void close_only() {
		pool.stop();
	}
	
}
