package creational.factory.ex3.products.victorian;

import creational.factory.ex3.products.Product;

public class VictorianSofa implements Product {

    @Override
    public double getPrice() {
        return 149.99;
    }

    @Override
    public String getDescription() {
        return "Victorian sofa from Queen Elizabeth's own room...";
    }
}
