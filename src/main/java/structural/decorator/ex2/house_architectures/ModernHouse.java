package structural.decorator.ex2.house_architectures;

public class ModernHouse extends HouseArchitectureDecorator {
    public ModernHouse(HouseArchitecture houseArchitecture) {
        super(houseArchitecture);
    }

    @Override
    public String build() {
        return super.build() + addNewBehavior();
    }

    private String addNewBehavior() {
        return " additional modern details";
    }
}
