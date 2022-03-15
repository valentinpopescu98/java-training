package creational.factory.ex3.products.victorian;

import creational.factory.ex3.products.Product;

public class VictorianTable implements Product {
    @Override
    public double getPrice() {
        return 49.99;
    }

    @Override
    public String getDescription() {
        return "Victorian table to put your Ouija board on and invoke spirits...";
    }
}
