package main;

import dao.StudentDao;

public class MainUpdate {
    public static void main(String[] args) {
        StudentDao manager = new StudentDao();

        manager.updateRow("Casian", 4, "Vali");

        manager.killConnection();
    }
}
