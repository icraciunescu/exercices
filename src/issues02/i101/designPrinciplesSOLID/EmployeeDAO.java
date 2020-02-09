package issues02.i101.designPrinciplesSOLID;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        // DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
        // connectionManager.connect();
        // connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
        // connectionManager.disconnect();
        System.out.println("save employee to the database: " + employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("delete employee from the database: " + employee);

    }

}
