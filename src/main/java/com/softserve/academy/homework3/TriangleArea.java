package com.softserve.academy.homework3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input side a: ");
        double a = input.nextDouble();
        System.out.print("Input side b: ");
        double b = input.nextDouble();
        System.out.print("Input side c: ");
        double c = input.nextDouble();

        System.out.println("The area of the triangle is: " + String.format("%.2f", calculateTriangleArea(a, b, c)));
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
