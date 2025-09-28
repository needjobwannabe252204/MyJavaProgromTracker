package a3.GUI;

import javax.swing.JOptionPane;

public class Main {

	public static void main (String[] args) {
		
		JOptionPane gui = new JOptionPane();
		
		String userName = gui.showInputDialog("Enter Your Name");
		gui.showMessageDialog(null, "Hi "+userName+"!");
		
		int userAge = Integer.parseInt(gui.showInputDialog("Enter Your Age"));
		gui.showMessageDialog(null, "So you are " +userAge+" years old!");
		
		float userTotalGrade = Float.parseFloat(gui.showInputDialog("Enter Your Grade"));
		gui.showInternalMessageDialog(null, "Your Grade is "+userTotalGrade);
		
		
	}
	

	
	
}
