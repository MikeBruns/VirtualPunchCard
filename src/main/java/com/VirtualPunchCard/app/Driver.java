/**********************************************************\\
 * Time sheet program to track employee's time for a pay
 *
 * Driver creates first login window
 *
 * @authors Mike Buns & Odero Ajamu
\\*********************************************************/

package com.VirtualPunchCard.app;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Driver class that will run the program. Starting at the login window.
 */
public class Driver extends JFrame{

    public static void main(String[] args){
        Driver freshFrame = new Driver();
    }

    JButton        loginBtn = new JButton("Login");
    JTextField  userNameTxt = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JPanel            panel = new JPanel();
    JLabel      userNameLbl = new JLabel("User Name");
    JLabel      passwordLbl = new JLabel("Password");

    Driver(){
        super("Virtual Punch Card");
        setSize(325,315);
        setLocationRelativeTo(null);
        panel.setLayout(null);

        userNameTxt.setBounds(70, 100, 150, 20);
        password.setBounds(70, 150, 150, 20);
        loginBtn.setBounds(110, 200, 80, 20);
        userNameLbl.setBounds(70, 80, 150, 20);
        passwordLbl.setBounds(70, 130, 150, 20);

        panel.add(userNameLbl);
        panel.add(userNameTxt);
        panel.add(password);
        panel.add(loginBtn);
        panel.add(passwordLbl);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        // Allows login via the "Enter" key
        panel.getRootPane().setDefaultButton(loginBtn);
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
                LoginService loginService = new LoginService();
                if (loginService.validCredentials(uNameInp, uPassInp)) {

                }

                if(uNameInp.equals("admin1")){
                    uName = true;
                    if(uPassInp.equals("password")){
                        uPass = true;

                        HomeFrame regFace = new HomeFrame();
                        regFace.setVisible(true);
                        dispose();
                    }

                } else{
                    if(!uName && !uPass){
                        JOptionPane.showMessageDialog(null, "User name or Password are incorrect");
                    }
                    userNameTxt.setText("");
                    password.setText("");
                    userNameTxt.requestFocus();
                }

            }
        }); // end loginBtn handling

    }

}
