package main;

import managers.Manager;
import model.Debtor;

public class MainQueryOne {
    static void printOne(Debtor debtor) {
        System.out.print(debtor.getStudent_id() + " ");
        System.out.print(debtor.getNume() + " ");
        System.out.print(debtor.getGrupa_student() + " ");
        System.out.print(debtor.getExamen_id() + " ");
        System.out.print(debtor.getMaterie() + " ");
        System.out.print(debtor.getData() + " ");
        System.out.print(debtor.getGrupa_examen() + " ");
        System.out.print(debtor.getNota() + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        Manager manager = new Manager();

        Debtor result = manager.queryOne();
        printOne(result);

        manager.killConnection();
    }
}
