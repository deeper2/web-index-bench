package nudt.structures.docinfo;

/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * @version $Id $.
 */
public class FastDocLength {
	private static int[] lengths;
	
	public static void setLengths(int totEntries, DocInfoInputStream inputStream){
		lengths = new int[totEntries];
		for (int i=0; i<totEntries; i++){
			DocInfoEntry ddEntry = inputStream.nextEntry();
			lengths[ddEntry.docid] = ddEntry.numTokens; 
		}
		inputStream.close();
	}
	
	public static final int getNumberOfTokens(int docid){
		return lengths[docid];
	}
}
