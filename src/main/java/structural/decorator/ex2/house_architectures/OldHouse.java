package structural.decorator.ex2.house_architectures;

public class OldHouse extends HouseArchitectureDecorator {
    public OldHouse(HouseArchitecture houseArchitecture) {
        super(houseArchitecture);
    }

    @Override
    public String build() {
        return super.build() + addNewBehavior();
    }

    private String addNewBehavior() {
        return " additional old details";
    }
}
