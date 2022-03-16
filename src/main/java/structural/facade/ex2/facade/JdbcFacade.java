package structural.facade.ex2.facade;

import structural.facade.ex2.DbSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFacade {
    private DbSingleton dbSingleton = DbSingleton.getInstance();
    private Statement statement;

    public JdbcFacade() {
        Connection connection = dbSingleton.getConnection();

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTableTeachers() {
        String sql = "CREATE TABLE Teachers (ID int, name VARCHAR(10), surname VARCHAR(32))";

        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Table created!");
    }

    public void insertTeacher(String name, String surname) {
        String insertSql = String.format("INSERT INTO Teachers (name, surname) VALUES (\"%s\", \"%s\")", name, surname);

        try {
            statement.executeUpdate(insertSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Values inserted!");
    }
}
