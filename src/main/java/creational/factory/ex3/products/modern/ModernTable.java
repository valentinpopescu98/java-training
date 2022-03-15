package creational.factory.ex3.products.modern;

import creational.factory.ex3.products.Product;

public class ModernTable implements Product {
    @Override
    public double getPrice() {
        return 45.99;
    }

    @Override
    public String getDescription() {
        return "Modern table to drink your coffee on...";
    }
}
