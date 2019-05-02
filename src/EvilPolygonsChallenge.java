import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot evil=new Robot();
		//2. Set the speed to 100
evil.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Blue", "Green", "Yellow", "Pink"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0) {
			evil.setPenColor(250, 0, 0);
		}
		else if (colorChoice==1) {
			evil.setPenColor(0, 250, 0);
		}
		else if(colorChoice==2) {
			evil.setPenColor(0, 0, 250);
		}
		else if(colorChoice==3) {
			evil.setPenColor(250, 200, 0);
		}
		else if(colorChoice==4) {
			evil.setPenColor(250, 150, 150);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons= JOptionPane.showInputDialog("How many polygons do you wish for?");
		//5. Use the robot to draw the number of polygons the user requested.
		int drawn=Integer.parseInt(polygons);
		for(int i=0; i<drawn; i++) {
			evil.penDown();
			evil.setAngle(350);
		evil.move(100);
		evil.setAngle(45);
		evil.move(100);
		evil.setAngle(135);
		evil.move(100);
		evil.setAngle(190);;
		evil.move(100);
		evil.setAngle(270);
		evil.move(105);
		
		//6. Make it so your shapes do not overlap
evil.penUp();
evil.move(150);
		//7. Challenge: add more colors to the Option Dialog.
	}
		}
}

