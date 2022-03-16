package structural.flyweight.ex1;

public class FlyweightIntegerExample {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(5);
        Integer integer2 = Integer.valueOf(5);
        Integer integer3 = Integer.valueOf(6);

        System.out.println(System.identityHashCode(integer));
        System.out.println(System.identityHashCode(integer2));
        System.out.println(System.identityHashCode(integer3));
    }
}
