import javax.swing.JOptionPane;

public class Rollercoaster {
	String name = "splashmountain";
	int minimumheight = 60;
	int capacity = 12;

	public static void main(String[] args) {
		Rollercoaster splashmountain = new Rollercoaster("splashmountain");
		for (int i = 0; i < splashmountain.capacity; i++) {
			String answer = JOptionPane.showInputDialog("How tall are you in inches?");
			int height = Integer.parseInt(answer);
			if (height >= splashmountain.minimumheight) {
				JOptionPane.showMessageDialog(null, "You can ride the rollercoaster!");
			} else {
				JOptionPane.showMessageDialog(null, "You cannot ride the rollercoaster:(");
			}
		}
	}

	Rollercoaster(String splashmountain) {
		name = splashmountain;
	}
}
