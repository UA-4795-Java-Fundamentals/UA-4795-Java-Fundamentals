package com.softserve.academy.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void sortByPrice(Product[] products) {
        Arrays.sort(products, Comparator.comparingDouble(Product::getPrice).reversed());
    }

    public static void sortByQuantity(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getQuantity).reversed());
    }
}
