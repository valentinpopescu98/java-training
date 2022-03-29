package demos.ex13;

import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.iterate(0, x -> x + 5);

        numbers.limit(10000)
                .forEach(System.out::println);
    }
}
