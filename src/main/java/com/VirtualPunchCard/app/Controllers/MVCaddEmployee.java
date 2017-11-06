package com.VirtualPunchCard.app.Controllers;

import java.sql.Date;


/**
 * Created by Odero Ajamu on 5/1/2017.
 */

// Class created to test the screen that will add employees
public class MVCaddEmployee {
    public static void main(String[] args) {

        EmployeeView theView = new EmployeeView();
        String dob = "1995/09/18";
        String hire = "2007/05/30";


        String date = "2008-05-26";
        String hdate = "2017-05-26";

        Employee theModel = new Employee(123,date,hdate,"Jimmi","Nootrin");//add parameters

        addEmployeeController theController = new addEmployeeController(theView, theModel);

        theView.setVisible(true);
    }
}                               