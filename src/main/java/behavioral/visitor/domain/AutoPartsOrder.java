package behavioral.visitor.domain;

import behavioral.visitor.AutoVisitor;

import java.util.ArrayList;
import java.util.List;

public class AutoPartsOrder implements AutoPart {
    private final List<AutoPart> parts = new ArrayList<>();

    @Override
    public void accept(AutoVisitor visitor) {
        parts.forEach(part -> part.accept(visitor));
        visitor.visit(this);
    }

    public void addPart(AutoPart part) {
        parts.add(part);
    }

    public List<AutoPart> getParts() {
        return parts;
    }
}
