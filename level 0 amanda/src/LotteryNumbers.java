import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	
	public static void main(String[] args) {
		Random random = new Random();
		JOptionPane.showMessageDialog(null, "Click to get lottery numbers", "Lottery Numbers", 0);
		int numbers = 0;
		String lottery = "";
		for (int i = 0; i < 5 ; i++) {
			numbers = random.nextInt(49) + 1;
			lottery = lottery + " " + Integer.toString(numbers);
		}
		JOptionPane.showMessageDialog(null, lottery);
	}
}
