package com.VirtualPunchCard.app;

import java.sql.Date;

/**
 * Class describing an employee
 */
public class Employee {
    private int     employeeID;
    private Date    dob;
    private Date    hireDate;
    private String  firstName;
    private String  lastName;

    public Employee(int employeeID, Date dob, Date hireDate,
                    String firstName, String lastName) {
        this.employeeID = employeeID;
        this.dob = dob;
        this.hireDate = hireDate;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
