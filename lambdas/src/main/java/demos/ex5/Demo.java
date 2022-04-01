package demos.ex5;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        String s1 = "str1";
        String s2 = "str2";

        DataProvider provider = new DataProvider() {
            @Override
            public Integer sum(Number a, Number b) {
                return (Integer) a + (Integer) b;
            }
        };

        Consumer<Object> printer = x -> System.out.println(x);
        printer.accept(
                provider.sum(a, b)
        );

        BiConsumer<String, String> concatenator = (x, y) -> printer.accept(x + y);
        concatenator.accept(s1, s2);

        Function<Integer, Integer> doubler = x -> x * 2;
        printer.accept(
                doubler.apply(
                        (Integer) provider.sum(a, b)
                )
        );
    }
}
