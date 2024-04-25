package org.example;

import food.products.Bread;
import food.products.Cookies;
import food.products.Milk;

import static org.example.ProductSelection.printBasket;
import static org.example.ProductSelection.printProucts;

public class Main {

    public static void main(String[] args) {
        //2) Liskov substitution principle - наследники класса Product полностью играют роль предка
        Product[] products = {new Milk(), new Bread(), new Cookies(), new Mobile()};
        printProucts(products);
        ProductSelection.input(products);
        printBasket(products);
    }
}