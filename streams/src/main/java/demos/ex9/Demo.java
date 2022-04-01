package demos.ex9;

import demos.IntegerWrapper;

import java.util.List;

import static demos.Utils.makeList;

public class Demo {
    public static void main(String[] args) {
        List<IntegerWrapper> lst = makeList();

        int sum1 = lst.stream()
                .map(IntegerWrapper::getValue)
                .reduce(0, (a, b) -> a + b);

        int sum2 = lst.stream()
                .map(IntegerWrapper::getValue)
                .reduce(0, Integer::sum);

        int sum3 = lst.stream()
                .mapToInt(IntegerWrapper::getValue)
                .sum();

        int max = lst.stream()
                .map(IntegerWrapper::getValue)
                .reduce(0, Integer::max);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(max);
    }
}
