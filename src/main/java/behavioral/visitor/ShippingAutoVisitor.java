package behavioral.visitor;

import behavioral.visitor.domain.AutoPart;
import behavioral.visitor.domain.AutoPartsOrder;
import behavioral.visitor.domain.Oil;
import behavioral.visitor.domain.Wheel;

import java.util.List;

public class ShippingAutoVisitor implements AutoVisitor {
    private double shippingPrice = 0;

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheels: 15");
        shippingPrice += 15;
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Oil: 10");
        shippingPrice += 10;
    }

    @Override
    public void visit(AutoPartsOrder order) {
        System.out.println("Discount for shipping: if more than 5 elements, discount 10!");
        List<AutoPart> parts = order.getParts();

        if (parts.size() > 5) {
            shippingPrice -= 10;
        }

        System.out.println("Shipping price: " + shippingPrice);
    }
}
