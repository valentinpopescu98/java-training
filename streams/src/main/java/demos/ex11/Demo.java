package demos.ex11;

import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        IntStream.range(0, 5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();
        IntStream.rangeClosed(0, 5)
                .forEach(x -> System.out.print(x + " "));
    }
}
