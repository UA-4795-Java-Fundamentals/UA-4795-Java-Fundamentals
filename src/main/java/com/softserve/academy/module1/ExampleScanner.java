package com.softserve.academy.module1;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        System.out.println("Hello UA-4795!");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println("You entered: " + input);

        int number = scanner.nextInt();
        System.out.println("You entered number: " + number);

        boolean bool = scanner.nextBoolean();
        System.out.println("You entered boolean: " + bool);

        double decimal = scanner.nextDouble();
        System.out.println("You entered double: " + decimal);

        long bigNumber = scanner.nextLong();
        System.out.println("You entered long: " + bigNumber);


        scanner.close();

    }
}
