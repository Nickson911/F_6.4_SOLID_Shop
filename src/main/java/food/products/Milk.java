package food.products;

import org.example.Product;

public class Milk extends Product {
    private final String name = "молоко";
    private final Integer price = 60;

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                "руб}";
    }
}
