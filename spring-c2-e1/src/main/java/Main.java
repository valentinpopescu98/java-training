import beans.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("project-config.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/project-config.xml");

//        Cat cat = context.getBean(Cat.class);
        Cat cat = context.getBean("cat1", Cat.class);

        System.out.println(cat.getName());
    }
}
