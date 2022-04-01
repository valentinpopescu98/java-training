package demos.ex4;

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        new ConsolePrinter().print(new DataProvider() {
            @Override
            public Number sum(Number a, Number b) {
                return (Integer) a + (Integer) b;
            }
        }, a, b);

        new ConsolePrinter().print((a1, b1) -> (Integer) a1 + (Integer) b1, a, b);
    }
}
