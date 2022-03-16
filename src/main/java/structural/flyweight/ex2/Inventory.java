package structural.flyweight.ex2;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {
    private Catalog catalog = new Catalog();
    private List<Order> orders = new CopyOnWriteArrayList<>();

    public void putOrder(ItemType itemType, Long orderNumber) {
        Item item = catalog.getItem(itemType);
        Order order = new Order(item, orderNumber);

        orders.add(order);
    }

    public void process() {
        orders.forEach(order -> {
            order.processOrder();
            orders.remove(order);
        });
    }

    public void showCatalogNo() {
        System.out.println("Total number of items: " + catalog.totalNo());
    }
}
