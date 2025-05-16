/**
 * Represents an employee with basic attributes and methods to manage them.
 */
public class Employee {
    private String firstName;    // Employee's first name
    private String lastName;     // Employee's last name
    private int employeeID;       // Employee's unique ID
    private double salary;        // Employee's salary

    /**
     * Initializes salary to 0.0.
     */
    public Employee() {
        this.salary = 0.0;
    }

    /**
     * Sets first name.
     * @param firstName New first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets first name.
     * @return First name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets last name.
     * @param lastName New last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets last name.
     * @return Last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets employee ID.
     * @param employeeID New employee ID
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets employee ID.
     * @return Employee ID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets salary.
     * @param salary New salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets salary.
     * @return Salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Prints employee details.
     */
    public void employeeSummary() {
        System.out.println("Employee Summary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}