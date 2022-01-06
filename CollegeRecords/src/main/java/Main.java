import managers.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

//        manager.insertRow();
//        manager.deleteRow();
//        manager.updateRow();
//        manager.queryOne();
        manager.query();

        manager.killConnection();
    }
}
