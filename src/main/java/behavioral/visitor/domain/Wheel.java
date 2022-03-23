package behavioral.visitor.domain;

import behavioral.visitor.AutoVisitor;

public class Wheel implements AutoPart {
    @Override
    public void accept(AutoVisitor visitor) {
        visitor.visit(this);
    }
}
