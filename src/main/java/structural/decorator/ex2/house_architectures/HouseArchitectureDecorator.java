package structural.decorator.ex2.house_architectures;

public class HouseArchitectureDecorator implements HouseArchitecture {
    protected HouseArchitecture houseArchitecture;

    public HouseArchitectureDecorator(HouseArchitecture houseArchitecture) {
        this.houseArchitecture = houseArchitecture;
    }

    @Override
    public String build() {
        return houseArchitecture.build();
    }
}
