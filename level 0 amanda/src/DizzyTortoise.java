import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {
	public static void main(String[] args) {
		String dizziness = JOptionPane.showInputDialog("How dizzy do you want the tortoise to be 1-10?");
		try {
			int answer = Integer.parseInt(dizziness);
			dance(answer);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Not a number");
		}
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
