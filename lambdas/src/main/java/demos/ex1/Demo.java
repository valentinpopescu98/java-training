package demos.ex1;

public class Demo {
    public static void main(String[] args) {
        new ConsolePrinter() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        }.print();

        ((ConsolePrinter) () -> System.out.println("Hello World!")).print();
    }
}
