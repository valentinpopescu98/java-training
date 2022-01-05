import managers.Manager;
import managers.Manager_DataSource;
import managers.Manager_PreparedStatement;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager_DataSource("src/main/resources/db.properties");

//        manager.insertRow("Vali", 3, 4);
//        manager.deleteRow(11);
//        manager.updateRow("Cristian", 1, "Marian");
        manager.query();

        manager.destroyConnection();
    }
}