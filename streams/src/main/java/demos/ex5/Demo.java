package demos.ex5;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;
import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        List<Integer> newLst = lst.stream()
                .map(x -> x.getValue() * 3)
                .collect(toList());

        newLst.forEach(System.out::println);
    }
}
