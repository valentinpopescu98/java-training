package creational.singleton.ex2;

public class Main {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();

        if (singleton == singleton2) {
            System.out.println(singleton.getClass().getName() + " is singleton.");
        }
    }
}
