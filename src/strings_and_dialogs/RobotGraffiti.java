package strings_and_dialogs;

import java.security.SecurityPermission;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot hi = new Robot();
		hi.setSpeed(10);
		hi.penDown();
		hi.setRandomPenColor();
		hi.turn(20);
		hi.move(200);
		hi.turn(135);
		hi.move(200);
		hi.turn(180);
		hi.move(100);
		hi.turn(-65);
		hi.move(72);
		hi.hide();
	}

}
