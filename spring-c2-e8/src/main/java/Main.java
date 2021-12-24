import beans.Cat;
import beans.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("project-config.xml");

        Owner owner = context.getBean(Owner.class);
        Cat cat = context.getBean(Cat.class);

        System.out.println(owner.getName());
        System.out.println(cat.getName());
        System.out.println("Owner's cat: "+owner.getCat().getName());
    }
}
