package structural.flyweight.ex2;

public class Item {
    private ItemType name;

    public Item(ItemType name) {
        this.name = name;
    }

    public ItemType getName() {
        return name;
    }
}
