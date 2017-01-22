// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Robot bob = new Robot();
		for (int o = 0; o < 10; o++) {
		//3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("What color do you want?");
		//4. use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}else if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		}else if (color.equalsIgnoreCase("pink")) {
			bob.setPenColor(Color.pink);
		}else if (color.equalsIgnoreCase("purple")) {
			bob.setPenColor(Color.magenta);
		}else if (color.equalsIgnoreCase("black")) {
			bob.setPenColor(Color.black);
		}else if (color.equalsIgnoreCase("orange")) {
			bob.setPenColor(Color.orange);
		}else if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		}
//5. if the user doesn’t enter anything, choose a random color
		else {
			bob.setRandomPenColor();
		}
		
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		bob.setPenWidth(5);
	//1. make the tortoise draw a shape (this will take more than one line of code)
		bob.setX(1000);
		bob.setY(500);
		bob.penDown();
		bob.setSpeed(10);
		for (int i = 0; i < 5; i++) {
			bob.turn(360/8);
			bob.move(64);
			bob.turn(-40);
			bob.move(200);
			bob.turn(170);
			bob.move(200);
			bob.turn(64);
			bob.move(200);
		}
		}

	}
}



