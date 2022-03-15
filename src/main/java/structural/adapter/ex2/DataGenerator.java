package structural.adapter.ex2;

import org.apache.commons.lang3.RandomStringUtils;
import structural.adapter.ex2.employees.EmployeeApp;
import structural.adapter.ex2.employees.EmployeeLdap;

public class DataGenerator {
    public static EmployeeApp getRandomEmployeeApp() {
        EmployeeApp.EmployeeAppBuilder builder = EmployeeApp.builder();

        return builder.id(RandomStringUtils.randomNumeric(1))
                .firstName("EmployeeApp_" + RandomStringUtils.randomAlphabetic(7))
                .lastName(RandomStringUtils.randomAlphabetic(7))
                .email(RandomStringUtils.randomAlphabetic(7))
                .build();
    }

    public static EmployeeLdap getRandomEmployeeLdap() {
        EmployeeLdap.EmployeeLdapBuilder builder = EmployeeLdap.builder();

        return builder.cn(RandomStringUtils.randomAlphabetic(7))
                .surname("EmployeeLdap_" + RandomStringUtils.randomAlphabetic(7))
                .givenName(RandomStringUtils.randomAlphabetic(7))
                .mail(RandomStringUtils.randomAlphabetic(7))
                .build();
    }
}
