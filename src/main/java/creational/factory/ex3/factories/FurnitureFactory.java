package creational.factory.ex3.factories;

import creational.factory.ex3.products.Furniture;
import creational.factory.ex3.products.FurnitureType;

public class FurnitureFactory {
    public static Furniture getFurniture(FurnitureType furnitureType) {
        switch (furnitureType) {
            case MODERN:
                return new ModernFurnitureFactory();
            case VICTORIAN:
                return new VictorianFurnitureFactory();
            default:
                throw new RuntimeException("Furniture type not supported.");
        }
    }
}
