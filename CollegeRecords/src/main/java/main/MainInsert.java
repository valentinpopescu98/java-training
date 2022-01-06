package main;

import managers.Manager;

public class MainInsert {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.insertRow("Vali", 5, 6);

        manager.killConnection();
    }
}
