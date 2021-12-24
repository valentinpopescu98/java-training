package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    public Cat() {
        System.out.println("No args constructor");
    }

    @Autowired
    public Cat(boolean val){
        System.out.println("Constructor with arg: " + val);
    }

    public String getName() {
        return "Johnny";
    }

    public int getAge() {
        return 8;
    }
}
