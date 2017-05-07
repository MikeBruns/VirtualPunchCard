package com.VirtualPunchCard.app;

import com.VirtualPunchCard.app.Controllers.addEmployeeController;
import com.VirtualPunchCard.app.Views.EmployeeView;
import com.VirtualPunchCard.app.Models.Employee;


/**
 * Created by Odero Ajamu on 5/1/2017.
 */

// Class created to test the screen that will add employees
public class MVCaddEmployee {
    public static void main(String[] args) {

        EmployeeView theView = new EmployeeView();
        Employee theModel = new Employee();

        addEmployeeController theController = new addEmployeeController(theView, theModel);

        theView.setVisible(true);
    }
}