package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    private String name;
    @Autowired
    private Cat cat;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
