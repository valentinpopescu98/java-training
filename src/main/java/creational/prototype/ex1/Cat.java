package creational.prototype.ex1;

import lombok.Getter;

@Getter
public class Cat implements Cloneable {
    private String color;
    private int age;

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
