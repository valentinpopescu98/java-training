package ex1;

import java.util.List;

import static java.util.Arrays.asList;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> lst = asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        lst
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println(x));
    }
}
