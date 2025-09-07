package com.softserve.academy.homework1;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of flower bed: ");
        radius = sc.nextInt();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("The perimeter of the flower bed is " + perimeter);
        System.out.println("The area of the flower bed is " + area);
    }
}
