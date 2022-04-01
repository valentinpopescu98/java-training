package demos.ex6;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        List<List<IntegerWrapper>> lst = List.of(makeList(), makeList(), makeList());

        List<Integer> newLst = lst.stream()
                .flatMap(x -> x.stream())
                .map(x -> x.getValue())
                .collect(toList());

        newLst.forEach(System.out::println);
    }
}
