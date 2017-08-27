// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	
	public static void main(String[] args) {
		
		int Random = new Random().nextInt(4);
		System.out.println(Random);
		JOptionPane.showInputDialog("You may ask a question");
		if (Random == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		if (Random == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		if (Random ==2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		if (Random == 3) {
			JOptionPane.showMessageDialog(null, "Ask again later");
		}
	}
}

