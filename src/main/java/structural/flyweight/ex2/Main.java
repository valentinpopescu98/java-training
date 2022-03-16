package structural.flyweight.ex2;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.putOrder(ItemType.PHONE, 1L);
        inventory.putOrder(ItemType.TV, 2L);
        inventory.putOrder(ItemType.WATCH, 3L);
        inventory.putOrder(ItemType.TV, 4L);
        inventory.putOrder(ItemType.PHONE, 5L);
        inventory.putOrder(ItemType.PHONE, 6L);

        inventory.process();
        inventory.showCatalogNo();
    }
}
