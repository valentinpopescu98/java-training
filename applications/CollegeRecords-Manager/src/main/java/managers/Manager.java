package managers;

public class Manager {
    public Manager(String propsPath) {
        createConnection(propsPath);
    }

    void createConnection(String propsPath) { }

    public void destroyConnection() { }

    public void insertRow(String nume, int grupa, int an_studii) { }

    public void deleteRow(int student_id) { }

    public void updateRow(String nume_nou, int grupa, String nume_vechi) { }

    public void query() { }
}
