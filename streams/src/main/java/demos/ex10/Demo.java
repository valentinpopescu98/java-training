package demos.ex10;

import demos.IntegerWrapper;

import java.util.List;
import java.util.stream.IntStream;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        IntStream.range(0, 5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();
        IntStream.rangeClosed(0, 5)
                .forEach(x -> System.out.print(x + " "));
    }
}
