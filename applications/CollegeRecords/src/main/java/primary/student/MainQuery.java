package primary.student;

import dao.StudentDao;
import model.Debtor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainQuery {
    static void print(List<Debtor> debtors) {
        for (Debtor debtor : debtors) {
            System.out.print(debtor.getStudentId() + " ");
            System.out.print(debtor.getName() + " ");
            System.out.print(debtor.getGroupStudent() + " ");
            System.out.print(debtor.getExamId() + " ");
            System.out.print(debtor.getSubject() + " ");
            System.out.print(debtor.getDate() + " ");
            System.out.print(debtor.getGroupExam() + " ");
            System.out.print(debtor.getGrade() + "\n");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean(StudentDao.class);

        List<Debtor> results = dao.queryDebtors();
        print(results);

        dao.killConnection();
    }
}
