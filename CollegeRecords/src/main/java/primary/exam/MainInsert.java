package primary.exam;

import dao.ExamDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInsert {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ExamDao dao = context.getBean(ExamDao.class);

        dao.insertExam(1, "Sisteme cu Microprocesoare", "Serban Andrei",
                "2010-02-25", 304);

        dao.killConnection();
    }
}
