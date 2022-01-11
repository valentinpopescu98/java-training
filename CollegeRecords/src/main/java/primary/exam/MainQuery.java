package primary.exam;

import dao.ExamDao;
import model.Exam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQuery {
    static void print(Exam exam) {
        System.out.print(exam.getExamId() + " ");
        System.out.print(exam.getStudyGroup() + " ");
        System.out.print(exam.getSubject() + " ");
        System.out.print(exam.getProfessorName() + " ");
        System.out.print(exam.getDate() + " ");
        System.out.print(exam.getClassroom() + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ExamDao dao = context.getBean(ExamDao.class);

        Exam result = dao.queryExam(1);
        print(result);

        dao.killConnection();
    }
}
