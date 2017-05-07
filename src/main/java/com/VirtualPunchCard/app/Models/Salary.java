package com.VirtualPunchCard.app.Models;

import com.VirtualPunchCard.app.Models.Employee;

import java.sql.Date;

/**
 * Class describing an employees monetary earnings.
 */
public class Salary extends Employee {

    public Salary(int employeeID, Date dob, Date hireDate, String firstName, String lastName) {
        super(employeeID, dob, hireDate, firstName, lastName);
    }
}
    //TODO Write Class
    //TODO Implement both salary and hourly rates

