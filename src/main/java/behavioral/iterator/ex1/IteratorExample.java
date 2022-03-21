package behavioral.iterator.ex1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "strawberry");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
