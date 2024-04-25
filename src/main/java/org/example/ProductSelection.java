package org.example;

import java.util.Scanner;

public class ProductSelection {
    //Magic Numbers Principle - вместо чисел используем константы
    public static final char RUB = (char) 0x20BD;

    //1) Single-responsibility principle - каждый делает только то, для чего он
    //предназначен
    public static void input(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество или введите `end` ");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
            //принцип DRY - повторяющийся вывод списка продуктов
            printBasket(products);
        }
    }

    public static void printProucts(Product[] products) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    public static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " 'количество'= " + product.getCount() + " шт,"
                        + " 'общая стоимость'= " + product.getCount() * product.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costProducts + " " + RUB);
    }
}
