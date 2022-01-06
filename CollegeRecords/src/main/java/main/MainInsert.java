package main;

import dao.StudentDao;

public class MainInsert {
    public static void main(String[] args) {
        StudentDao manager = new StudentDao();

        manager.insertRow("Vali", 5, 6);

        manager.killConnection();
    }
}
