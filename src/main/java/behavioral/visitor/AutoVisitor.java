package behavioral.visitor;

import behavioral.visitor.domain.AutoPartsOrder;
import behavioral.visitor.domain.Oil;
import behavioral.visitor.domain.Wheel;

public interface AutoVisitor {
    void visit(Wheel wheel);
    void visit(Oil oil);
    void visit(AutoPartsOrder order);
}
