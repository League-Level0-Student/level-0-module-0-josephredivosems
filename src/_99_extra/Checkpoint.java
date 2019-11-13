package _99_extra;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Checkpoint {
public static void main(String[] args) {
	



String response =	JOptionPane.showInputDialog("What is your favorite colour?(plz do capital)");

JOptionPane.showMessageDialog(null, response + " is also my favorite colour.");



Robot ace = new Robot();


	ace.penDown();
	for (int i = 0; i < 3; i++) {
		
	ace.setSpeed(100);
	ace.turn(120);
	ace.move(100);
	}






































}
}
