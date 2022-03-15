package structural.adapter.ex1;

import java.util.List;

import static java.util.Arrays.asList;

public class CollectionsAdaperExample {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3};
        List<Integer> lst = asList(arr);

        System.out.println(arr);
        System.out.println(lst);
    }
}
