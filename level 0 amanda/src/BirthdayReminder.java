 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 3rd";
		String dadsBirthday = "September 10th";
		String myBirthday = "December 23rd";
		String elvisBirthday = "January 8th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthdayWanted = JOptionPane.showInputDialog("What Birthday?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, birthdayWanted);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (birthdayWanted.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (birthdayWanted.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (birthdayWanted.equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}else if (birthdayWanted.equals("elvis")) {
			JOptionPane.showMessageDialog(null, elvisBirthday);
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
