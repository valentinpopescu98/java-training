package structural.adapter.ex2;

import structural.adapter.ex2.employees.Employee;

import java.util.ArrayList;
import java.util.List;

import static structural.adapter.ex2.DataGenerator.getRandomEmployeeApp;
import static structural.adapter.ex2.DataGenerator.getRandomEmployeeLdap;


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            employees.add(getRandomEmployeeApp());
        }

        for (int i = 0; i < 10; i++) {
            employees.add(new EmployeeLdapAdapter(getRandomEmployeeLdap()));
        }

        employees.forEach(employee -> System.out.println(employee.getFirstName()));
    }
}
