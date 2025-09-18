package com.softserve.academy.homework4;

import java.util.Scanner;

public class PracticalTasksApp {
    public static void main(String[] args) {
        // 1. Enter three numbers from the console.
        // Determine and output the result of how many of them are odd.
        // Output the result to the console.

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        int oddCounter = 0;

        System.out.print("Enter three numbers ->> ");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] % 2 == 0)
                oddCounter++;
        }
        System.out.println(oddCounter + " number out of 3 is/are odd.");

        // --------------------------------

        // 2. Enter the number of the day of the week from the console.
        // Output the name of the day of the week in two languages.
        // Output the result to the console.

        System.out.println("\n// --------------------------------");
        System.out.print("Enter number of the day ->> ");
        int day = sc.nextInt();
        DayOfWeek dayOfWeek = DayOfWeek.fromCode(day);
        System.out.println("Your days is " + dayOfWeek.getNameEng() + " / " + dayOfWeek.getNameUkr());

        // --------------------------------

        // 3. Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.).
        // Ask the user to enter the name of the country from the console.
        // Using a switch statement, determine the continent to which the entered country
        // belongs and output the name of the continent. Output the result to the console.

        System.out.println("\n// --------------------------------");
        System.out.print("Enter a country name: ");
        String country = sc.next();

        Continents continent;

        switch (country.trim().toLowerCase()) {
            case "france":
            case "germany":
            case "ukraine":
            case "italy":
                continent = Continents.EUROPE;
                break;

            case "china":
            case "japan":
            case "india":
                continent = Continents.ASIA;
                break;

            case "nigeria":
            case "egypt":
            case "kenya":
                continent = Continents.AFRICA;
                break;

            case "usa":
            case "canada":
            case "mexico":
                continent = Continents.NORTH_AMERICA;
                break;

            case "brazil":
            case "argentina":
            case "chile":
                continent = Continents.SOUTH_AMERICA;
                break;

            case "australia":
            case "new zealand":
                continent = Continents.AUSTRALIA;
                break;

            case "antarctica":
                continent = Continents.ANTARCTICA;
                break;

            default:
                continent = null;
                break;
        }

        if (continent != null) {
            System.out.println("Entered country belongs to " + continent.getName() + ".");
        } else {
            System.out.println("Sorry, continent for \"" + country + "\" is not in the database.");
        }

        // --------------------------------

        // 4. Create class called Product...
        System.out.println("\n// --------------------------------");
        Product[] products = {
                new Product("Laptop", 1200.50, 5),
                new Product("Phone", 800.00, 15),
                new Product("Tablet", 450.75, 10),
                new Product("Console", 950.25, 20)
        };

        // Sorting by price
        Product.sortByPrice(products);
        System.out.println("Most expensive:");
        System.out.println("Name: " + products[0].getName() + ", price: " + products[0].getPrice());

        // Sorting by quantity
        Product.sortByQuantity(products);
        System.out.println("\nBiggest quantity:");
        System.out.println("Name: " + products[0].getName() + ", quantity: " + products[0].getQuantity());

        sc.close();
    }
}

