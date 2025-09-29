package com.softserve.academy.homework4;

import java.util.Scanner;

public class CheckNumberRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter a second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter a third number:");
        double num3 = scanner.nextDouble();

        if ((num1 >= -5) && (num1 <= 5) && (num2 >= -5) && (num2 <= 5) && (num3 >= -5) && (num3 <= 5)) {
            System.out.println("All numbers belong range: [-5, 5].");
        } else {
            System.out.println("Not all numbers belong range:2 [-5, 5].");
        }

        scanner.close();
    }
}
