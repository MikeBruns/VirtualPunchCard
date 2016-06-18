/**********************************************************\\
 * Time sheet program to track employee's time for a pay 
 * 
 * Class is frame to enter users data about hours
 * and other pay information regarding their time worked
 * 
 * @author Mike Buns & Keista Keista
 \\*********************************************************/

import javax.swing.*;

public class newframe extends JFrame {

	public static void main(String[] args) {
			newframe freshFrame = new newframe();
	}


	JPanel panel = new JPanel();

	newframe(){
		super("Virtual Punch Card");
		setSize(800,700);
		setLocationRelativeTo(null);
		panel.setLayout (null); 
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}