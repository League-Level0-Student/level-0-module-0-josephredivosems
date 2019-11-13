package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	
	Robot ace = new Robot("mini");
	ace.setSpeed(100);
	ace.setRandomPenColor();
	ace.turn(-90);
	ace.move(50);
	ace.setRandomPenColor();
	ace.turn(90);
	ace.move(100);
	ace.setRandomPenColor();
	ace.turn(-90);
	ace.move(50);
	ace.setRandomPenColor();
	ace.turn(180);
	ace.penDown();
	ace.setRandomPenColor();
	ace.move(50);
	ace.setRandomPenColor();
	ace.move(50);
	ace.turn(180);
	ace.setRandomPenColor();
	ace.move(25);
	ace.setRandomPenColor();
	ace.move(25);
	ace.turn(-90);
	
	ace.setRandomPenColor();ace.move(100);
	for (int i = 0; i < 9; i++) {
		ace.setRandomPenColor();
		ace.turn(20);
		ace.move(8);
		ace.setRandomPenColor();
		ace.move(8);
	}
	
	ace.turn(90);
	ace.penUp();
	ace.move(200);
	ace.turn(-90);
	ace.penDown();
	ace.setRandomPenColor();
	ace.move(85);
	ace.turn(180);
	ace.move(135);
	ace.turn(-90);
	ace.setRandomPenColor();
	ace.move(25);
	for (int i = 0; i < 45; i++) {
		ace.setRandomPenColor();
		ace.turn(-2);
		ace.move(2);
	}
	ace.setRandomPenColor();
	ace.move(20);
	
	for (int i = 0; i < 45; i++) {
		ace.setRandomPenColor();
		ace.turn(-2);
		ace.move(2);
	}
	

	ace.setRandomPenColor();
	ace.move(20);
	
	
	
	
	
	
	ace.moveTo(700, 700);
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    







	}



