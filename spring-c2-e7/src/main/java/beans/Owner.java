package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    private String name;
    private Cat cat;

    public Owner(String name, Cat cat) {
        this.cat = cat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
