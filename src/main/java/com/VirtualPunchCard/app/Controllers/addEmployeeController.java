package com.VirtualPunchCard.app.Controllers;
import com.VirtualPunchCard.app.Views.EmployeeView;
import com.VirtualPunchCard.app.Models.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Odero Ajamu on 4/25/2017.
 */
public class addEmployeeController {

    private EmployeeView theView;
    private Employee theModel;

    public addEmployeeController(EmployeeView theView, Employee theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addEmployeeListener(new EmployeeListener());

    }

    class EmployeeListener implements ActionListener {

            public void actionPerformed(ActionEvent arg0){

                    // Need to implement a calendar for inputting the dates
                int Emp_ID;
                int dob;
                int Hire_Date;
                int First_Name;
                int Last_Name;

                //try{
                    Emp_ID = theView.getEmployeeID();
                    dob = theView.getDob();
                    Hire_Date = theView.getHireDate();
                    First_Name = theView.getFirstName();
                    Last_Name=theView.getLastName();

                }
                //catch(String ex)
            }
    }

