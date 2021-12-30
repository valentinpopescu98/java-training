public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

//        manager.InsertRow("Georgiana", 6, -1);
//        manager.DeleteRow(12);
//        manager.UpdateRow("Cristina", 2, "Andreea");
        manager.Query();

        manager.DestroyConnection();
    }
}