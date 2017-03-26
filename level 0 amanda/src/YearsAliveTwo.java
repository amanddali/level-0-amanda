import javax.swing.JOptionPane;

public class YearsAliveTwo {
	public static void main(String[] args) {
		int currentyear = 2017;
		String answer = JOptionPane.showInputDialog("What year were you born?");
		int year = Integer.parseInt(answer);
		for (int i = year; i <= currentyear; i++) {
			System.out.print(i);
			if (i < currentyear) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		for (int r = currentyear; r >= year; r--) {
			System.out.print(r);
			if (r > year) {
				System.out.print(", ");
			}
		}
	}
}
