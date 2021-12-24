package beans;

public class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Default";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
