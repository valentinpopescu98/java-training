package creational.factory.ex3;

import creational.factory.ex3.factories.FurnitureFactory;
import creational.factory.ex3.products.FurnitureType;
import creational.factory.ex3.products.ProductType;
import creational.factory.ex3.products.Furniture;
import creational.factory.ex3.products.Product;

public class Main {
    public static void main(String[] args) {
        Furniture modernFurniture = FurnitureFactory.getFurniture(FurnitureType.MODERN);
        System.out.println(modernFurniture.getClass());

        Furniture victorianFurniture = FurnitureFactory.getFurniture(FurnitureType.VICTORIAN);
        System.out.println(victorianFurniture.getClass());

        Product modernSofa = modernFurniture.getProduct(ProductType.SOFA);
        System.out.println(modernSofa.getClass());

        Product modernTable = modernFurniture.getProduct(ProductType.TABLE);
        System.out.println(modernTable.getClass());

        Product victorianSofa = victorianFurniture.getProduct(ProductType.SOFA);
        System.out.println(victorianSofa.getClass());

        Product victorianTable = victorianFurniture.getProduct(ProductType.TABLE);
        System.out.println(victorianTable.getClass());
    }
}
