package demos.ex12;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        stream1.forEach(x -> System.out.print(x + " "));
        System.out.println();
        stream2.forEach(x -> System.out.print(x + " "));
    }
}
