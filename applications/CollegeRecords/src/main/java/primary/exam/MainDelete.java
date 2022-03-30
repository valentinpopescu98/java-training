package primary.exam;

import dao.ExamDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDelete {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ExamDao dao = context.getBean(ExamDao.class);

        dao.deleteExam(9);

        dao.killConnection();
    }
}
