package com.VirtualPunchCard.app.Models;

import java.sql.Date;

/**
 * Class describing an employee
 */
public class Employee {
    private int     Emp_No;
    private Date    dob;
    private Date    hireDate;
    private String  First_Name;
    private String  Last_Name;

    public Employee(int Emp_No, Date dob, Date hireDate,
                    String First_Name, String Last_Name) {
        this.Emp_No = Emp_No;
        this.dob = dob;
        this.hireDate = hireDate;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }



    public int getEmp_No() {
        return Emp_No;
    }

    public void setEmp_No(int Emp_No) {
        this.Emp_No = Emp_No;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }
}
