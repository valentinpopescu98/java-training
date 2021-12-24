package beans;

public class Owner {
    private String name;
    private Cat cat;

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setName(String name) {
        this.name = name;
    }
}
