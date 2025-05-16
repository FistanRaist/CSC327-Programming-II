/**
 * Tests Employee and Manager classes.
 */
public class EmployeeTest {
    /**
     * Creates and tests Employee and Manager objects.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstName("John");
        emp.setLastName("Doe");
        emp.setEmployeeID(1001);
        emp.setSalary(50000.0);
        emp.employeeSummary();

        System.out.println();

        Manager mgr = new Manager();
        mgr.setFirstName("Jane");
        mgr.setLastName("Smith");
        mgr.setEmployeeID(2001);
        mgr.setSalary(75000.0);
        mgr.setDepartment("Sales");
        mgr.employeeSummary();
    }
}