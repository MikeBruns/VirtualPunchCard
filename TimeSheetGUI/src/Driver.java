/**********************************************************\\
 * Time sheet program to track employee's time for a pay 
 * 
 * Driver creates first login window
 * 
 * @author Mike Buns & Keista Keista
 \\*********************************************************/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class Driver extends JFrame{
	
	public static void main(String[] args){
		Driver freshFrame = new Driver();
	}
	
	JButton loginBtn = new JButton("Login");
	JTextField userNameTxt = new JTextField(15);
	JPasswordField password = new JPasswordField(15);
	JPanel panel = new JPanel();
	
	Driver(){
		super("Virtual Punch Card");
		setSize(300,200);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		
		userNameTxt.setBounds(70, 30, 150, 20);
		password.setBounds(70, 60, 150, 20);
		loginBtn.setBounds(110, 100, 80, 20);
		
		panel.add(userNameTxt);
		panel.add(password);
		panel.add(loginBtn);
		
		
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		actionlogin();
		
	} // End of Driver()

	private void actionlogin() {
		
		
		loginBtn.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent ae){
			boolean uName = false;
			boolean uPass = false;
			String uError = null;
			String pError = null;
			String uNameInp = userNameTxt.getText();
			String uPassInp = password.getText();     // TODO work on switching to .getPassword()
			
			// TODO = call SQL function to retrieve user info
			
			if(uNameInp.equals("admin")){
				uName = true;
				if(uPassInp.equals("password")){
					uPass = true;
					
					newframe regFace = new newframe();
					regFace.setVisible(true);
					dispose();
				}
				
			}
			else{ // use switch case
				if(uName)
					uError = "Wrong Username";
				if(!uPass)
					pError = "Wrong Password";
				
				if(!uName && !uPass){
					
					JOptionPane.showMessageDialog(null, uError + " & " + pError);
				}
				
				userNameTxt.setText("");
				password.setText("");
				userNameTxt.requestFocus();
			}

		} 
		}); // end loginBtn handling
		
	}
}