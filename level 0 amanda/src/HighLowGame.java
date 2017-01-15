 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		int random = new Random().nextInt(101);	
		boolean finish = false;
		System.out.println(random);
				for (int i = 0; !finish &&  i < 10; i++) {
		String answer = JOptionPane.showInputDialog("Make A Guess");
			int guess = Integer.parseInt(answer);
			if(random==guess){
				JOptionPane.showMessageDialog(null, "You Win!");
				finish = true;
			}
			else if(guess>random){
				JOptionPane.showMessageDialog(null, "Too High");
			}
			else if(guess<random){
				JOptionPane.showMessageDialog(null, "Too low");
			}
		}
			if(!finish){
				JOptionPane.showMessageDialog(null, "You Lose");
			
			}
	}

}

