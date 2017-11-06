package com.VirtualPunchCard.app.Controllers;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by Odero Ajamu on 4/1/2017.
 */
public class EmployeeView extends JFrame{

    private JLabel employeeIDLabel = new JLabel("Employee ID *");
    private JTextField employeeID = new JTextField(10);
    private JLabel dobLabel = new JLabel("Date of Birth *");
    private JTextField dob = new JTextField(10);
    private JLabel HireDateLabel = new JLabel("Hire Date *");
    private JTextField HireDate = new JTextField(10);
    private JLabel NameLabel = new JLabel("Name ");
    private JLabel FirstLabel = new JLabel("First * ");
    private JTextField First = new JTextField(10);
    private JLabel LastLabel = new JLabel("Last * ");
    private JTextField Last = new JTextField(10);
    private JButton EmployeeBtn = new JButton("Add Employee");

 EmployeeView() {
     super("Add a New Employee");

     JPanel empPanel = new JPanel();
     setSize(800, 700);

     empPanel.add(employeeIDLabel);
     empPanel.add(employeeID);
     empPanel.add(dobLabel);
     empPanel.add(dob);
     empPanel.add(HireDateLabel);
     empPanel.add(HireDate);
     empPanel.add(NameLabel);
     empPanel.add(FirstLabel);
     empPanel.add(First);
     empPanel.add(LastLabel);
     empPanel.add(Last);
     empPanel.add(EmployeeBtn);
     this.add(empPanel);

 }

 public int getEmployeeID(){
     return Integer.parseInt(employeeID.getText());

 }
    public int getDob(){
        return Integer.parseInt(dob.getText());

    }
    public int getHireDate(){
        return Integer.parseInt(HireDate.getText());

    }
    public int getFirstName(){
        return Integer.parseInt(First.getText());

    }
    public int getLastName(){
        return Integer.parseInt(Last.getText());

    }
   public void addEmployeeListener(ActionListener listenForEmpButton){

        EmployeeBtn.addActionListener(listenForEmpButton);

    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this,errorMessage);
    }




}
