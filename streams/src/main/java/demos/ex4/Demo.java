package demos.ex4;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
                .map(IntegerWrapper::getId)
                .forEach(System.out::println);
    }
}
