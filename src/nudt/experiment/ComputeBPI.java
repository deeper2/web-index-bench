package nudt.experiment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ComputeBPI {

	public static void main(String[] args) throws IOException {
		String[] codecname = { "OldSimple9_F", "OldSimple16_F", "OldSimple8b_F", "OptSimple9_F", "OptSimple16_F",
				"OptSimple8b_F","optp4d","afor2","vseblock","VSENaive","vsesimple" };//

		for (int i = 0; i < codecname.length; i++) {
			String path = "D:\\workspace\\web_index\\" + codecname[i];
			File file = new File(path + "\\index.invn");
			//System.out.println(file.length() + "Bytes");
			Properties indexProperties = new Properties();

			indexProperties.load(new FileInputStream(path + "/index.properties"));
			long pointers = Long.parseLong(indexProperties.getProperty("index.numberOfPointers"));

			System.out.println("bits per int of " + codecname[i] + ": " + (float) (file.length() * 8) / (pointers * 2));
		}
	}
}
