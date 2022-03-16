package structural.facade.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
    private static DbSingleton dbSingleton;
    private Connection connection;

    public DbSingleton() {
        if (dbSingleton != null) {
            throw new RuntimeException(dbSingleton.toString() + " is already instantiated.");
        }
    }

    public static DbSingleton getInstance() {
        if (dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if (dbSingleton == null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }

        return dbSingleton;
    }

    public Connection getConnection() {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/vali_schema";
        String dbUser = "vali";
        String dbPass = "123456";

        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
