package demos.ex7;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
                .limit(3)
                .forEach(x -> System.out.println(x.getValue()));
    }
}
