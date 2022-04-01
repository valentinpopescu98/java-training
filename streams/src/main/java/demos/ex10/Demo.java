package demos.ex10;

import demos.IntegerWrapper;

import java.util.List;
import java.util.Optional;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        Optional<Integer> first = lst.stream()
                .map(x -> x.getValue())
                .filter(x -> x < 15)
                .findFirst();

        Optional<Integer> any = lst.stream()
                .map(x -> x.getValue())
                .filter(x -> x < 15)
                .findAny();

        Optional<Integer> firstLowerThanFive = lst.stream()
                .map(x -> x.getValue())
                .filter(x -> x < 5)
                .findFirst();

        Optional<Integer> firstLowerThanZeroShowEmpty = lst.stream()
                .map(x -> x.getValue())
                .filter(x -> x < 0)
                .findFirst();

        Optional<Integer> firstLowerThanZeroDontShowEmpty = lst.stream()
                .map(x -> x.getValue())
                .filter(x -> x < 0)
                .findFirst();

        System.out.println(first);
        System.out.println(any);
        System.out.println(firstLowerThanFive);
        System.out.println(firstLowerThanZeroShowEmpty);
        firstLowerThanZeroDontShowEmpty.ifPresent(System.out::println);
    }
}
