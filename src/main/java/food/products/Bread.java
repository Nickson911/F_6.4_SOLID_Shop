package food.products;

import org.example.Product;

public class Bread extends Product {
    private final String name = "Хлеб";
    private final Integer price = 50;

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                "руб}";
    }
}
