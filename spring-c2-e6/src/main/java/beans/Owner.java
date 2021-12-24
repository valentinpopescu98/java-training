package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    private final String name;
    private final Cat cat;

    @Autowired
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
}
