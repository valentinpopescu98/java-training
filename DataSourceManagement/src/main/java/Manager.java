import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class Manager {
    public DataSource CreateConnection() {
        Properties props = new Properties();
        FileInputStream fis = null;
        MysqlDataSource mysqlDS = null;

        try {
            fis = new FileInputStream("db.properties");
            props.load(fis);
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(props.getProperty("url"));
            mysqlDS.setUser(props.getProperty("user"));
            mysqlDS.setPassword(props.getProperty("password"));
        }
        catch (Exception e) {
            System.out.println("Failed to create connection: " + e);
        }
    }
}
