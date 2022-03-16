package structural.facade.ex2.normal;

import structural.facade.ex2.DbSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {
        DbSingleton dbSingleton = DbSingleton.getInstance();

        Connection connection = dbSingleton.getConnection();
        Statement statement = connection.createStatement();

        String sql = "CREATE TABLE Teachers (ID int, name VARCHAR(10), surname VARCHAR(32))";
        statement.executeUpdate(sql);
        System.out.println("Table created!");

        String insertSql = "INSERT INTO Teachers (name, surname) VALUES (\"Maria\", \"Iliescu\")";
        statement.executeUpdate(insertSql);
        System.out.println("Values inserted!");
    }
}
