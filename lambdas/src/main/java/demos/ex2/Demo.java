package demos.ex2;

public class Demo {
    public static void main(String[] args) {
        new ConsolePrinter().print(new TextProvider() {
            @Override
            public String provide() {
                return "Hello World!";
            }
        });

        new ConsolePrinter().print(() -> "Hello World!");
    }
}
