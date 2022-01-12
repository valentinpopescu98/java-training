package primary.exam;

import dao.ExamDao;
import model.Exam;
import model.ExamStatistics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQueryStatistics {
    static void printExam(Exam exam) {
        System.out.print(exam.getExamId() + " ");
        System.out.print(exam.getStudyGroup() + " ");
        System.out.print(exam.getSubject() + " ");
        System.out.print(exam.getProfessorName() + " ");
        System.out.print(exam.getDate() + " ");
        System.out.print(exam.getClassroom() + " ");
    }

    static void print(ExamStatistics statistics) {
        printExam(statistics.getExam());
        System.out.print(statistics.getStudentsAttending() + " ");
        System.out.print(statistics.getStudentsPromoted() + " ");
        System.out.print(statistics.getAverageGrade() + "\n");
        System.out.println();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ExamDao dao = context.getBean(ExamDao.class);

        ExamStatistics result = dao.queryExamStatistics(1);
        print(result);

        dao.killConnection();
    }
}
