package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Owner {
    private String name;
    @Autowired
    private Cat cat;

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
