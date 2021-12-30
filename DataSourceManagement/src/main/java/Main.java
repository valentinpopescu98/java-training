import javax.sql.DataSource;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DataSource ds = null;

        Manager manager = new Manager();
        ds = manager.CreateConnection();

        Connection con = null;
        
    }
}