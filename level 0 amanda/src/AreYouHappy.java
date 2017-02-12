import java.net.URI;

import javax.swing.JOptionPane;

public class AreYouHappy {
	static int YES = 0;
	static int NO = 1;

	public static void main(String[] args) {
		boolean keepDoing = false;
		int answerOne = (JOptionPane.showConfirmDialog(null, "Are you happy?"));
		if (answerOne == YES) {
			keepDoing = true;
		} else if (answerOne == NO) {
			int answerTwo = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
			if (answerTwo == YES) {
				JOptionPane.showMessageDialog(null, "Change Something");
			} else if (answerTwo == NO) {
				keepDoing = true;
			}
		}
		if (keepDoing) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");

		}
		playVideo("https://youtu.be/y6Sxv-sUYtM");
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