package structural.decorator.ex2;

import structural.decorator.ex2.house_architectures.ModernHouse;
import structural.decorator.ex2.house_architectures.OldHouse;
import structural.decorator.ex2.house_architectures.SimpleHouseArchitecture;

public class Main {
    public static void main(String[] args) {
        SimpleHouseArchitecture simpleHouseArchitecture = new SimpleHouseArchitecture();
        ModernHouse modernHouse = new ModernHouse(simpleHouseArchitecture);
        OldHouse oldHouse = new OldHouse(modernHouse);

        System.out.println(modernHouse.build());
        System.out.println(oldHouse.build());
    }
}
