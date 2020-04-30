package nudt.compression.partition;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;

public class Player {
	public static void stop_play() {
		try {
			File file = new File("./stop.wav");
			AudioClip audioClip = Applet.newAudioClip(file.toURI().toURL());
			/* audioClip.play(); */
			audioClip.loop();
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
