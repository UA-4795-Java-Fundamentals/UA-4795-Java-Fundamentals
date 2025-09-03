package com.softserve.academy.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input radius: ");
        int radius = input.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
