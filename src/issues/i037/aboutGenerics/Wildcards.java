package issues.i037.aboutGenerics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void accessOthers() {

        Employee employee = new Employee();
        Accountant accountant = new Accountant();
        //employee = accountant;

        ArrayList<Employee> employees2 = new ArrayList<>();
        employees2.add(employee);
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        accountants2.add(accountant);

        ArrayList<? extends Employee> employees = new ArrayList<>();
        ArrayList<Accountant> accountants = new ArrayList<>();

        ArrayList<Employee> employees1 = new ArrayList<>();
        ArrayList<? super Accountant> accountants1 = new ArrayList<>();

        makeEmployeesWork(accountants2);

    }

    public static void makeEmployeesWork(List<? extends Employee> employees) {
        for (Employee employee : employees) {
            employee.work();
        }
    }

}
