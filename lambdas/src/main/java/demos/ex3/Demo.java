package demos.ex3;

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        new ConsolePrinter().print(new DataProvider() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, a, b);

        new ConsolePrinter().print((x, y) -> x + y, a, b);
    }
}
