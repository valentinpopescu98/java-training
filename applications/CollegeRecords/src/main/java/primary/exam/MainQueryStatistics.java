package primary.exam;

import dao.ExamDao;
import model.ExamStatistics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQueryStatistics {
    static void print(ExamStatistics statistics) {
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
