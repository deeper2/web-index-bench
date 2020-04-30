package nudt.experiment;

import java.io.IOException;

import nudt.structures.docinfo.DocInfoOutputStream;
//import nudt.terrier.structures.DocumentIndexInputStream;
//import nudt.terrier.structures.Index;
//import nudt.terrier.utility.ApplicationSetup;
import uk.ac.gla.terrier.structures.DocumentIndexInputStream;
import uk.ac.gla.terrier.structures.Index;
import uk.ac.gla.terrier.utility.ApplicationSetup;


/**
 * @author <a href="mailto:simonj@idi.ntnu.no">Simon Jonassen</a>
 * document information stored
 * @version $Id $.
 */
public class DocInfoConverter {
	
	public static void convertDocDict(String terrierpath, String dstpath){
		System.setProperty("terrier.home", terrierpath);
		System.setProperty("terrier.etc", terrierpath + "/etc/");
		System.setProperty("terrier.setup", terrierpath + "/etc/terrier.properties");
		
/*		nudt.terrier.structures.Index tIndex = Index.createIndex();
		DocumentIndexInputStream docstream = new DocumentIndexInputStream(ApplicationSetup.TERRIER_INDEX_PATH, ApplicationSetup.TERRIER_INDEX_PREFIX);
*/
		//change all class from nudt.terrier to uk.ac.gla.terrier (Index,DocumentIndexInputStream and ApplicationSetup)
		Index tIndex = Index.createIndex();
		DocumentIndexInputStream docstream = new DocumentIndexInputStream(ApplicationSetup.TERRIER_INDEX_PATH, ApplicationSetup.TERRIER_INDEX_PREFIX);

		nudt.structures.Index lIndex = new nudt.structures.Index(dstpath);
		DocInfoOutputStream ddow = lIndex.getDocDictOutputStream();
		
		//int i=0; 
		try {
			while (docstream.readNextEntry() != -1){
				//System.out.println(docstream.getDocumentId());
				ddow.nextEntry(
				docstream.getDocumentId(),
				docstream.getDocumentNumber(),
				docstream.getDocumentLength());
				//if (++i % 5000000 == 0) System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		docstream.close();
		tIndex.close();
		ddow.close();
		lIndex.close();
	}
	
	public static void main(String args[]) throws IOException, InterruptedException{
//		String inpath = "D:\\workspace\\terrier-lite";
		String inpath = "D:\\software\\terrier-2.2.1";
		String outpath ="./index";
		if (args.length>0){
			inpath = args[0];
			outpath= args[1];
		}
		convertDocDict(inpath,outpath);
	}
}