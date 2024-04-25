package food.products;

import org.example.Product;

public class Cookies extends Product {
    private final String name = "печенье";
    private final Integer price = 80;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                "руб}";
    }
}
