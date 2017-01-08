import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot walli;
	walli = new Robot();
	walli.penDown();
	walli.sparkle();
	walli.setSpeed(10);
	walli.setRandomPenColor();
	walli.turn(-15);
	walli.move(200);
	walli.turn(-150);
	walli.move(200);
	walli.turn(180);
	walli.move(100);
	walli.turn(75);
	walli.move(50);
	walli.penUp();
	walli.turn(75);
	walli.move(100);
	walli.turn(-75);
	walli.move(100);
	walli.penDown();
	walli.turn(-90);
	walli.move(200);
	walli.turn(180);
	walli.move(200);
	walli.turn(-90);
	walli.move(75);
	walli.penUp();
	walli.move(100);
}
}
