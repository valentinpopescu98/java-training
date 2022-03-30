package primary.student;

import dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUpdate {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao = context.getBean(StudentDao.class);

        dao.updateStudent("Casian", 4, 4, 5);

        dao.killConnection();
    }
}
