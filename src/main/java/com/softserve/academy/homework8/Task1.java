package com.softserve.academy.homework8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input the first number: ");
            double a = input.nextDouble();
            System.out.print("Input the second number: ");
            double b = input.nextDouble();

            if (b == 0) {
                throw new ArithmeticException("Division by zero is now allowed!");
            }

            System.out.println(div(a, b));

        } catch (InputMismatchException e) {
            System.out.println("You can only input numbers");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
