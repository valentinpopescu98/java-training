package behavioral.iterator.ex2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FruitRepository fruitRepository = new FruitRepository(3);
        fruitRepository.add("apple");
        fruitRepository.add("orange");
        fruitRepository.add("strawberry");
        fruitRepository.add("peach");

        Iterator<String> iterator = fruitRepository.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
