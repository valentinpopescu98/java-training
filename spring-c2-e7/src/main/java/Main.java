import beans.Cat;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Owner owner = context.getBean(Owner.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(owner.getName());
        System.out.println(cat.getName());
        System.out.println("Owner's cat: "+owner.getCat().getName());
    }
}
