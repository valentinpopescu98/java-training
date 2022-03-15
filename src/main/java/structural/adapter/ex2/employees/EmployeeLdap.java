package structural.adapter.ex2.employees;

import lombok.Builder;

@Builder
public class EmployeeLdap {
    private final String cn;
    private final String surname;
    private final String givenName;
    private final String mail;

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
