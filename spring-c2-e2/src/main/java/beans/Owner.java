package beans;

public class Owner {
    private String name;
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
