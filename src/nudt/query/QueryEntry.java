package nudt.query;

import nudt.structures.lexicon.LexiconEntry;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class QueryEntry{
	protected LexiconEntry lexiconEntry;
	protected int keyFrequency;
	
	public QueryEntry(LexiconEntry lEntry, int kFrequency){
		lexiconEntry = lEntry;
		keyFrequency = kFrequency;
	}
	
	public final LexiconEntry getLexiconEntry(){
		return lexiconEntry;
	}
	
	public final int getKeyFrequency(){
		return keyFrequency;
	}
	
	public final void incrementKeyFrequency(){
		keyFrequency++;
	}
	
	public final String toString(){
		return lexiconEntry + ":" + keyFrequency;
	}
}
