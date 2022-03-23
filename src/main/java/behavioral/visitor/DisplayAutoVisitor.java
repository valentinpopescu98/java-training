package behavioral.visitor;

import behavioral.visitor.domain.AutoPartsOrder;
import behavioral.visitor.domain.Oil;
import behavioral.visitor.domain.Wheel;

public class DisplayAutoVisitor implements AutoVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Wheel");
    }

    @Override
    public void visit(Oil oil) {
        System.out.println("Oil");
    }

    @Override
    public void visit(AutoPartsOrder order) {
        System.out.println("Order");
    }
}
