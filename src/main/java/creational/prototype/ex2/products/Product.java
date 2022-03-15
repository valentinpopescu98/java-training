package creational.prototype.ex2.products;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product implements Cloneable {
    private String name;
    private double price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
