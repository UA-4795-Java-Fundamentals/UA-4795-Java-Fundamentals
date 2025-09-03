package com.softserve.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius of Flower bed:");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter of a Flower Bed = " + perimeter);
        System.out.println("Area of a Flower Bed = " + area);
   }
}
