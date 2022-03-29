package demos.ex3;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
                .filter(x -> x.getValue() % 2 == 0)
                .forEach(x -> System.out.println(x.getValue()));
    }
}
