import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Manager_PreparedStatement extends Manager {
    Connection connection;
    PreparedStatement statement;
    ResultSet resultSet;

    @Override
    public void DestroyConnection() {
        try {
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void InsertRow(String nume, int grupa, int an_studii){
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

    @Override
    public void DeleteRow(int student_id) {
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

    @Override
    public void UpdateRow(String nume_nou, int grupa, String nume_vechi) {
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

    @Override
    public void Query() {
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

    @Override
    void CreateConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vali_schema",
                    "vali","123456");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
