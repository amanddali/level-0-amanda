import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {
		Robot bob = new Robot();
		bob.setX(150);
		bob.setY(200);
		bob.penDown();
		bob.setSpeed(10);
		for (int i = 0; i < 360; i++) {
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
