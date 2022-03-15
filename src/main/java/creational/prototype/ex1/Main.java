package creational.prototype.ex1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat("black", 3);
        Cat clone = (Cat) cat.clone();

        System.out.println(clone.getColor());
        System.out.println(clone.getAge());

        if (cat != clone) {
            System.out.println("The objects are different.");
        }
    }
}
