package creational.factory.ex3.factories;

import creational.factory.ex3.products.ProductType;
import creational.factory.ex3.products.modern.ModernSofa;
import creational.factory.ex3.products.modern.ModernTable;
import creational.factory.ex3.products.Furniture;
import creational.factory.ex3.products.Product;

public class ModernFurnitureFactory extends FurnitureFactory implements Furniture {
    @Override
    public Product getProduct(ProductType productType) {
        switch (productType) {
            case SOFA:
                return new ModernSofa();
            case TABLE:
                return new ModernTable();
            default:
                throw new RuntimeException("Product type not supported.");
        }
    }
}
