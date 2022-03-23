package behavioral.template;

import behavioral.template.order.OnlineOrder;
import behavioral.template.order.Order;
import behavioral.template.order.StoreOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------- Online order --------------");
        Order onlineOrder = new OnlineOrder();
        onlineOrder.setGift(true);
        onlineOrder.processOrder();

        System.out.println("-------------- Store order  --------------");
        Order storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
