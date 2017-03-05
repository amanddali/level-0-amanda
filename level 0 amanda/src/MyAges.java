import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("How old are you?");
		int age;
		try{
		age = Integer.parseInt(ageString);
		}catch(Exception e){
			age = 0;
		}
		String all;
		//JOptionPane.showMessageDialog(null, "You have been 1 year old");
		all = "You have been 1 year old\n";
		for (int i = 2; i < age; i++) {
			//JOptionPane.showMessageDialog(null, "You have been "+ i +" years old");
			all = all + "You have been " + i +" years old\n";
		}
		//JOptionPane.showMessageDialog(null, "You are "+ age +" years old");
		all = all + "You are " + age +"  years old";
		JOptionPane.showMessageDialog(null, all);
	}
}
