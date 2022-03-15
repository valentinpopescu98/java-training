package structural.adapter.ex2;

import structural.adapter.ex2.employees.Employee;
import structural.adapter.ex2.employees.EmployeeLdap;

public class EmployeeLdapAdapter implements Employee {
    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getMail();
    }
}
