package behavioral.iterator.ex2;

import java.util.Arrays;
import java.util.Iterator;

public class FruitRepository implements Iterable<String> {
    private int index;
    private String[] fruits;

    public FruitRepository(int size) {
        index = 0;
        fruits = new String[size];
    }

    public void add(String fruit) {
        if (index == fruits.length) {
            fruits = Arrays.copyOf(fruits, fruits.length + 1);
        }

        fruits[index] = fruit;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < fruits.length && fruits[currentIndex] != null;
            }

            @Override
            public String next() {
                return fruits[currentIndex++];
            }
        };
    }
}
