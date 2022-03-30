package managers;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Manager_DataSource extends Manager {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public Manager_DataSource(String propsPath) {
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

            ds = new MysqlDataSource();
            ds.setURL(props.getProperty("url"));
            ds.setUser(props.getProperty("user"));
            ds.setPassword(props.getProperty("password"));

            fis.close();

            connection = ds.getConnection();
            statement = connection.createStatement();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroyConnection() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRow(String nume, int grupa, int an_studii) {
        try {
            int i = statement.executeUpdate(String.format("insert into student (nume, grupa, an_studii) values ('%s', %d, %d)",
                    nume, grupa, an_studii));

            System.out.println(i + " records inserted");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRow(int student_id) {
        try {
            int i = statement.executeUpdate("delete from student where student_id = " + student_id);

            System.out.println(i + " records deleted");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRow(String nume_nou, int grupa, String nume_vechi) {
        try {
            int i = statement.executeUpdate(String.format("update student set nume = '%s', grupa = %d where nume = '%s'",
                    nume_nou, grupa, nume_vechi));

            System.out.println(i + " records updated");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void query() {
        try {
            resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("student_id") + " " + resultSet.getString("nume") +
                        " " + resultSet.getInt("grupa") + " " + resultSet.getInt("an_studii"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
