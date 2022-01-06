package main;

import managers.Manager;

public class MainUpdate {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.updateRow("Casian", 4, "Vali");

        manager.killConnection();
    }
}
