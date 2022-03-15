package structural.adapter.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAdapterExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        List<Integer> lst = stream.collect(Collectors.toList());

        System.out.println(stream);
        System.out.println(lst);
    }
}
