package com.VirtualPunchCard.app.Controllers;

import java.sql.Date;
/**
 * Class describing a manager
 */
public class Manager extends Employee {
    private int Manager_No;
    private int Manager_Lvl;
    private int Emp_No;
    private int Dept_No;

    public Manager(int Emp_No,String dob, String Hire_Date,String First_Name, String Last_Name,int manager_No, int manager_Lvl,  int dept_No ) {

        super(Emp_No,dob,Hire_Date,First_Name,Last_Name);
        Manager_No = manager_No;
        Manager_Lvl = manager_Lvl;
        Dept_No = dept_No;



    }

    public int getManager_No() {
        return Manager_No;
    }

    public void setManager_No(int manager_No) {
        Manager_No = manager_No;
    }

    public int getManager_Lvl() {
        return Manager_Lvl;
    }

    public void setManager_Lvl(int manager_Lvl) {
        Manager_Lvl = manager_Lvl;
    }

    public int getEmp_No() {
        return Emp_No;
    }

    public void setEmp_No(int emp_No) {
        Emp_No = emp_No;
    }

    public int getDept_No() {
        return Dept_No;
    }

    public void setDept_No(int dept_No) {
        Dept_No = dept_No;
    }
}
    //TODO Write Class


