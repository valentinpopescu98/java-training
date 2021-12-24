package beans;

public class Owner {
    private String name;
    private Cat cat;

    public Owner(String name, Cat cat) {
        this.name = name;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }
}
