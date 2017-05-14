import javax.swing.JOptionPane;

public class Fibonacci {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = 1;
		String answer = JOptionPane.showInputDialog("How many numbers of fibonacci would you like?");
		int repeat = Integer.parseInt(answer);
		System.out.print("0");
		System.out.print(" 1");
		for( int i = 0; i < repeat-2; i++){
			System.out.print(" " + z);
			x = y;
			y = z;
			z = x + y;
		}
	}
}
