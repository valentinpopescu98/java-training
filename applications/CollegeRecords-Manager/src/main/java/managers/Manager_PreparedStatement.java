package managers;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Manager_PreparedStatement extends Manager {
    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;

    public Manager_PreparedStatement(String propsPath) {
        super(propsPath);
    }

    @Override
    void createConnection(String propsPath) {
        Properties props = new Properties();
        FileInputStream fis;
        MysqlDataSource ds = null;

        try {
            fis = new FileInputStream(propsPath);
            props.load(fis);

            Class.forName(props.getProperty("driver")).newInstance();

            connection = DriverManager.getConnection(props.getProperty("url"),
                    props.getProperty("user"),props.getProperty("password"));

            fis.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroyConnection() {
        try {
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRow(String nume, int grupa, int an_studii){
        try {
            statement = connection.prepareStatement(
                    "insert into student (nume, grupa, an_studii) values (?, ?, ?)");
            statement.setString(1, nume);
            statement.setInt(2, grupa);
            statement.setInt(3, an_studii);

            int i = statement.executeUpdate();
            System.out.println(i + " records inserted");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRow(int student_id) {
        try {
            statement = connection.prepareStatement(
                    "delete from student where student_id = ?");
            statement.setInt(1, student_id);

            int i = statement.executeUpdate();
            System.out.println(i + " records deleted");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRow(String nume_nou, int grupa, String nume_vechi) {
        try {
            statement = connection.prepareStatement(
                    "update student set nume = ?, grupa = ? where nume = ?");

            statement.setString(1, nume_nou);
            statement.setInt(2, grupa);
            statement.setString(3, nume_vechi);

            int i = statement.executeUpdate();
            System.out.println(i + " records updated");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void query() {
        try {
            statement = connection.prepareStatement("select * from student");

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) +
                        " " + resultSet.getInt(3) + " " + resultSet.getInt(4));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
