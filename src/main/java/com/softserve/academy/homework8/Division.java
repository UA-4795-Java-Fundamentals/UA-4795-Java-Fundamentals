package com.softserve.academy.homework8;

import java.util.Scanner;

public class Division {
    static double div(double d1, double d2) throws ArithmeticException {
        if (d2 == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return d1 / d2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a first double number:");
            double d1 = scanner.nextDouble();
            System.out.println("Enter a second double number:");
            double d2 = scanner.nextDouble();
            System.out.println("Division = " + div(d1, d2));
        } catch (ArithmeticException e) {
            System.out.println("Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
