package behavioral.visitor;

import behavioral.visitor.domain.AutoPartsOrder;
import behavioral.visitor.domain.Oil;
import behavioral.visitor.domain.Wheel;

public class Main {
    public static void main(String[] args) {
        AutoPartsOrder order = new AutoPartsOrder();
        order.addPart(new Oil());
        order.addPart(new Wheel());
        order.addPart(new Oil());
        order.addPart(new Oil());
        order.addPart(new Oil());
        order.addPart(new Wheel());

        order.accept(new DisplayAutoVisitor());
        order.accept(new ShippingAutoVisitor());
    }
}
