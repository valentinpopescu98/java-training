package primary.student;

import dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInsert {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean(StudentDao.class);

        dao.insertStudent("Vali", 5, 6);

        dao.killConnection();
    }
}
