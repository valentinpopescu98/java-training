import beans.Cat;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c = context.getBean(Cat.class); // by type
//        Cat c = context.getBean("cat1", Cat.class); // by name

        System.out.println(c.getName());
    }
}
