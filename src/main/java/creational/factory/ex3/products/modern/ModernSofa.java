package creational.factory.ex3.products.modern;

import creational.factory.ex3.products.Product;

public class ModernSofa implements Product {
    @Override
    public double getPrice() {
        return 99.99;
    }

    @Override
    public String getDescription() {
        return "Modern sofa for rich guys...";
    }
}
