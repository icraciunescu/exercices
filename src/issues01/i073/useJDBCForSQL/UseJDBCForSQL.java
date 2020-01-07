package issues01.i073.useJDBCForSQL;

import java.sql.*;

public class UseJDBCForSQL {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employees_database";
        int rowsAffected;
        try {
            Connection connection = DriverManager.getConnection( url, "root", "password" );
            Statement statement = connection.createStatement();
//            rowsAffected = statement.executeUpdate( "insert into employees_tbl (id, name, depart, salary) value (900, 'robert', 'sales', 4000);" );
//            rowsAffected = statement.executeUpdate( "delete from employees_tbl where id = 900;" );
            rowsAffected = statement.executeUpdate( "update employees_tbl set salary = 5900 where id = 700;" );
            ResultSet resultSet = statement.executeQuery( "select * from employees_tbl where salary >= 4000" );
            int salarySum = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getString( "name" ) + " - " + resultSet.getInt( "salary" ));
                salarySum = salarySum + resultSet.getInt( "salary" );
            }
            System.out.println("rows affected: " + rowsAffected);
            System.out.println("total salary: " + salarySum);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
