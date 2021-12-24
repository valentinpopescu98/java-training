import beans.Cat;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c = context.getBean(Cat.class);

        System.out.println(c.getName() + " " + c.getAge());
    }
}
