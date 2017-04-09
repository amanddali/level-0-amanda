
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Do you like bananas?");
		if (answer.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		} else if (answer.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		} else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}

	}

}