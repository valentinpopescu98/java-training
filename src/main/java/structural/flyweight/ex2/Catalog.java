package structural.flyweight.ex2;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<ItemType, Item> items = new HashMap<>();

    public Item getItem(ItemType itemType) {
        if (!items.containsKey(itemType)) {
            items.put(itemType, new Item(itemType));
        }

        return items.get(itemType);
    }

    public int totalNo() {
        return items.entrySet().size();
    }
}
