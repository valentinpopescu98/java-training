public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager_DataSource();

//        manager.InsertRow("Vali", 3, 4);
//        manager.DeleteRow(11);
//        manager.UpdateRow("Cristian", 1, "Marian");
        manager.Query();

        manager.DestroyConnection();
    }
}