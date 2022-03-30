package primary.exam;

import dao.ExamDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUpdate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ExamDao dao = context.getBean(ExamDao.class);

        dao.updateExam(2, "Limbaje Formale si Automate", "Birleanu Silviu",
                "2015-02-09", 305, 9);

        dao.killConnection();
    }
}
