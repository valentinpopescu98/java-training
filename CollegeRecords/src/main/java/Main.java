import managers.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("src/main/resources/db.properties");

//        manager.insertRow();
//        manager.deleteRow();
//        manager.updateRow();
//        manager.queryOne();
        manager.query();

        manager.killConnection();
    }
}
