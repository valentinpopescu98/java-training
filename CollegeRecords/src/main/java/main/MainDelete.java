package main;

import managers.Manager;

public class MainDelete {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.deleteRow(17);

        manager.killConnection();
    }
}
