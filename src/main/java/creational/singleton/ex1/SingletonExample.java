package creational.singleton.ex1;

public class SingletonExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        if (runtime == runtime2) {
            System.out.println(runtime.getClass().getName() + " is singleton.");
        }
    }
}
