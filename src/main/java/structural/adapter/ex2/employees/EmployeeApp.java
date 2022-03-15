package structural.adapter.ex2.employees;

import lombok.Builder;

@Builder
public class EmployeeApp implements Employee {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String email;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
