package main;

import dao.StudentDao;
import model.Debtor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQueryOne {
    static void printOne(Debtor debtor) {
        System.out.print(debtor.getStudentId() + " ");
        System.out.print(debtor.getNume() + " ");
        System.out.print(debtor.getGrupaStudent() + " ");
        System.out.print(debtor.getExamenId() + " ");
        System.out.print(debtor.getMaterie() + " ");
        System.out.print(debtor.getData() + " ");
        System.out.print(debtor.getGrupaExamen() + " ");
        System.out.print(debtor.getNota() + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean(StudentDao.class);

        Debtor result = dao.queryOne();
        printOne(result);

        dao.killConnection();
    }
}
