package demos.ex2;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;
import static java.util.Comparator.comparing;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        lst.stream()
                .sorted(comparing(IntegerWrapper::getValue))
                .forEach(x -> System.out.println(x.getValue()));
    }
}
