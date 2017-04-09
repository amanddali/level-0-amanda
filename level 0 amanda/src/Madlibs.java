import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {
		String noun = JOptionPane.showInputDialog("Type in a noun");
		String verb = JOptionPane.showInputDialog("Type in a verb");
		String adjective = JOptionPane.showInputDialog("Type in a adjective");
		JOptionPane.showMessageDialog(null, adjective + " " + noun + " " + verb);
		JOptionPane.showMessageDialog(null, adjective + "\n" + noun + "\n" + verb);
	}
}
