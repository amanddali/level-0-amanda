import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {
		Robot bob = new Robot();
		bob.setSpeed(10);
		bob.setX(150);
		bob.setY(200);
		bob.penDown();
		for (int i = 0; i < 360; i++) {
			bob.setSpeed(10);
			bob.move(3);
			bob.turn(1);
			if (i%20 == 0) {
				for (int j = 0; j < 360; j++) {
					bob.move(1);
					bob.turn(1);
				}
			}
		}
	}
}
