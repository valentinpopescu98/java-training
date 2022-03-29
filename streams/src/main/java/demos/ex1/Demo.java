package demos.ex1;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;
import static java.util.Comparator.comparing;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
                .filter(x -> x.getValue() % 2 == 0)
                .sorted(comparing(IntegerWrapper::getValue))
                .forEach(System.out::println);

        System.out.println();
        lst.parallelStream()
                .filter(x -> x.getValue() % 2 == 0)
                .sorted(comparing(IntegerWrapper::getValue))
                .forEach(System.out::println);
    }
}
