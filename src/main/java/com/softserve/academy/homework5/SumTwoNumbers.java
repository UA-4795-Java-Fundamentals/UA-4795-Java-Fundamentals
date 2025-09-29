package com.softserve.academy.homework5;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("Sum of this number = " + sum);
            System.out.println("Do you want repeat (yes/no)?");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("yes"));
        System.out.println("Program is finished");
        scanner.close();
    }
}
