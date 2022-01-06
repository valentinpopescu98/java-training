package main;

import dao.StudentDao;
import model.Debtor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainQueryAll {
    static void printAll(List<Debtor> debtors) {
        for (Debtor debtor : debtors) {
            System.out.print(debtor.getStudent_id() + " ");
            System.out.print(debtor.getNume() + " ");
            System.out.print(debtor.getGrupa_student() + " ");
            System.out.print(debtor.getExamen_id() + " ");
            System.out.print(debtor.getMaterie() + " ");
            System.out.print(debtor.getData() + " ");
            System.out.print(debtor.getGrupa_examen() + " ");
            System.out.print(debtor.getNota() + "\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean(StudentDao.class);

        List<Debtor> results = dao.queryAll();
        printAll(results);

        dao.killConnection();
    }
}
