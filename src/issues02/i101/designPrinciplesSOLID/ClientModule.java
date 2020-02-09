package issues02.i101.designPrinciplesSOLID;

public class ClientModule {

    public static void main(String[] args) {
        Employee myEmployee = new Employee( 1, "xxx", "x", true );
        hireNewEmployee( myEmployee );
        printEmployeeReport( myEmployee, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee( employee );
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee( employee );
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter( employee, formatType );
        System.out.println(formatter.getFormattedEmployee());
    }

}
