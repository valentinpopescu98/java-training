package behavioral.visitor.domain;

import behavioral.visitor.AutoVisitor;

public class Oil implements AutoPart {
    @Override
    public void accept(AutoVisitor visitor) {
        visitor.visit(this);
    }
}
