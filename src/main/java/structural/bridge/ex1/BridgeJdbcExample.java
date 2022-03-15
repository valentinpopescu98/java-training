package structural.bridge.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeJdbcExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            String dbUrl = "jdbc:mysql://127.0.0.1:3306/vali_schema";
            String dbUser = "vali";
            String dbPass = "123456";

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);

            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE Teachers (ID int, name VARCHAR(10), surname VARCHAR(32))");
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
