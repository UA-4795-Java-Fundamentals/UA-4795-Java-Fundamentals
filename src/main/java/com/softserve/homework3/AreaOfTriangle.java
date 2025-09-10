package com.softserve.homework3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static double areaOfTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1 of triangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter side 2 of triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Enter side 3 of triangle: ");
        double c = scanner.nextDouble();
        System.out.println("The area of triangle is: " + areaOfTriangle(a, b, c));
        scanner.close();
    }
}
