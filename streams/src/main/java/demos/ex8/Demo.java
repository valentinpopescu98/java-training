package demos.ex8;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        boolean anyBiggerThanFive = lst.stream()
                .anyMatch(x -> x.getValue() > 5);

        boolean allBiggerThanFive = lst.stream()
                .allMatch(x -> x.getValue() > 5);

        boolean noneBiggerThanFive = lst.stream()
                .noneMatch(x -> x.getValue() > 5);

        System.out.println(anyBiggerThanFive);
        System.out.println(allBiggerThanFive);
        System.out.println(noneBiggerThanFive);
    }
}
