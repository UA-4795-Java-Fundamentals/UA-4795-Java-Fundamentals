package com.softserve.academy.homework1;

public class ClothingStoreReceipt {
    public static void main(String[] args) {
        // Input nesecary data
        String customerName = "Olena";
        int itemsBought = 2;
        double itemPrice = 750.5;
        String paymentMethod = "cash";

        // Calculate here the total cost
        double totalCost = itemPrice * itemsBought;

        // Print purchase details
        System.out.println("Welcome, " + customerName + ", thank you for your purchase!");
        System.out.println("Number of items: " + itemsBought);
        System.out.println("Price per item: " + itemPrice + " UAH.");
        System.out.println("Total cost: " + totalCost + " UAH.");
        System.out.println("Payment method: " + paymentMethod);
    }
}
