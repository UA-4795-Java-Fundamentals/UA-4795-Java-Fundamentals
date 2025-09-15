package com.softserve.homework4;

import java.util.Scanner;

public class MaxAndMinValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer number:");
        int n1 = scanner.nextInt();
        System.out.println("Enter first second number:");
        int n2 = scanner.nextInt();
        System.out.println("Enter first third number:");
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        int min = n1;
        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
