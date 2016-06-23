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
			//validLogin(uNameInp, uPassInp);
			
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
	
	boolean validLogin(string unInp, string upInp){
	
		try {
	
		        //Identify the driver to use
		        Class.forName(nameOfJdbcOdbcDriver);
		
		        //Attempt a connection to database...
		        Connection myConnectionRequest =
		                DriverManager.getConnection(
		                        dataBaseNameDSN, userName, passwordForUser);
		
		        //Create a statement object, use its method to execute query
		        Statement  myStatementObject =
		                myConnectionRequest.createStatement();
		
		        //Use statement object method to execute a query.
		        //Hold results in a resutl set...like a cursor
		        ResultSet myResultTuples = myStatementObject.executeQuery
		                                        (queryToBeExecuted);                 
		
		        //Call metadata to get the number of attributes
		        myResultTuplesMetaData = myResultTuples.getMetaData();
		        int numberOfAttributes =
		                myResultTuplesMetaData.getColumnCount();
		        System.out.println(Integer.toString(numberOfAttributes));
		
		
		
				string SQLstatement;
				SQLstatment = "SELECT loginID, passwordID " +
					      "FROM login "		    +
					      "WHERE loginID = "  +  unInp  + 
					      "AND passwordID = " +  upInp;
							  
				if(numTuples != 1)
					return false;
				
				while(myResultTuples.next()){
					string    loginID = myResultTuples.getString("loginID");
					string passwordID = myResultTuples.getString("passwordID");
				}
				
				if(loginID.equals(unInp) && passwordID.equals(upInp))
						return true;
			
		} // end of try block
		
		//handle exceptions 
		catch (SQLException sqlError) {
			System.out.println("Unexpected exception : " +
					sqlError.toString() + ", sqlstate = " +
					sqlError.getSQLState());
			sqlError.printStackTrace();
		}

	} // End of validLogin()
}
