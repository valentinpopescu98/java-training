package structural.flyweight.ex2;

public class Order {
    private Item item;
    private Long id;

    public Order(Item item, Long id) {
        this.item = item;
        this.id = id;
    }

    public void processOrder() {
        System.out.println(String.format("Order number %s with name %s.", id, item.getName()));
    }
}
