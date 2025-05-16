/**
 * Extends Employee to represent a manager with a department.
 */
public class Manager extends Employee {
    private String department;    // Manager's department

    /**
     * Sets department.
     * @param department New department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets department.
     * @return Department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Prints employee details including department.
     */
    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + department);
    }
}