public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setFirstName("Brian");
        emp.setLastName("Denehey");
        emp.setEmployeeID(1001);
        emp.employeeSummary();

        System.out.println();

        Manager mgr = new Manager();
        mgr.setFirstName("Janet");
        mgr.setLastName("Longoria");
        mgr.setEmployeeID(2001);
        mgr.setDepartment("Sales");
        mgr.employeeSummary();
    }
}