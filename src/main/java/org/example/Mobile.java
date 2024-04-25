package org.example;

public class Mobile extends Product implements Device, Phone {
    //3) Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //4) Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Xiaomi";
    private final int price = 5000;

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void carry() {
    }

    @Override
    public void call() {
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                "руб}";
    }
}