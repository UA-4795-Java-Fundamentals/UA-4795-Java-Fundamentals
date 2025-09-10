package com.softserve.homework3;

import java.util.Scanner;

public class SmallestNumber {
    public static int findTheSmallestNumber(int a, int b, int c) {
        int result = a;
        if (result > b) {
            result = b;
        }
        if (result > c) {
            result = c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = scanner.nextInt();
        System.out.println("Input the second number: ");
        int b = scanner.nextInt();
        System.out.println("Input the third number: ");
        int c = scanner.nextInt();
        System.out.println("The smallest number is: " + findTheSmallestNumber(a, b, c));
        scanner.close();
    }
}
