package behavioral.visitor.domain;

import behavioral.visitor.AutoVisitor;

public interface AutoPart {
    void accept(AutoVisitor visitor);
}
