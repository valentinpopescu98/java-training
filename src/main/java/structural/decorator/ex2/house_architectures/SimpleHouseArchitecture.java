package structural.decorator.ex2.house_architectures;

public class SimpleHouseArchitecture implements HouseArchitecture {
    @Override
    public String build() {
        return "Simple house";
    }
}
