package creational.factory.ex3.factories;

import creational.factory.ex3.products.ProductType;
import creational.factory.ex3.products.victorian.VictorianSofa;
import creational.factory.ex3.products.victorian.VictorianTable;
import creational.factory.ex3.products.Furniture;
import creational.factory.ex3.products.Product;

public class VictorianFurnitureFactory extends FurnitureFactory implements Furniture {
    @Override
    public Product getProduct(ProductType productType) {
        switch (productType) {
            case SOFA:
                return new VictorianSofa();
            case TABLE:
                return new VictorianTable();
            default:
                throw new RuntimeException("Product type not supported.");
        }
    }
}
