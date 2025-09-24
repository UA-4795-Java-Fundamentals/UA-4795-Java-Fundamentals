package com.softserve.academy.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double a = input.nextDouble();
        System.out.print("Input the second number: ");
        double b = input.nextDouble();
        System.out.print("Input the third number: ");
        double c = input.nextDouble();

        if (checkRange(a, b, c)) {
            System.out.println("All three numbers are within the range");
        }
        else {
            System.out.println("At least one number is not in the range");
        }
    }

    public static boolean checkRange(double a, double b, double c) {
        if (a > 5 || a < -5) return false;
        if (b > 5 || b < -5) return false;
        return c <= 5 && c >= -5;
    }
}
