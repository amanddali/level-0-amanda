import java.net.URI;
import java.util.Random;

import javax.swing.JOptionPane;

public class SoundtrackToLife {
	static int HAPPY = 2;
	static int SAD = 1;
	static int STRESSED = 0;

	public static void main(String[] args) {
		String happyVideo = "https://www.youtube.com/watch?v=XlNhbhavMyg";
		String sadVideo = "random";
		int random = 0;
		for (int i = 0; i < 10; i++) {

			// 1. Adjust this pop-up to find out what mood the user is in.
			int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Soundtrack To Life", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "happy", "sad", "stressed", "satisfying" },
					null);

			// 2. Their answer is stored in the userMood variable. Print it out.
			System.out.println(userMood);
			// 3. If they are in a stressed mood, use the playVideo method to
			// play a
			// calming song from YouTube.
			if (userMood == HAPPY) {
				playVideo(happyVideo);
			} else if (userMood == SAD) {
				random = new Random().nextInt(2);
				if (random == 0) {
					sadVideo = "https://youtu.be/k4V3Mo61fJM";
				} else if (random == 1) {
					sadVideo = "https://youtu.be/HaN-_dE33To";
				}
				playVideo(sadVideo);
			} else if (userMood == 0) {
				playVideo("https://youtu.be/OzOpQ6VqHCo");
			} else if (userMood == 3) {
				playVideo("https://youtu.be/970N2f05io4");
			}
			// 4. Play different songs for other moods.

			// If you are seeing ads at the beginning of your videos, install
			// Adblock.
		}
	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
