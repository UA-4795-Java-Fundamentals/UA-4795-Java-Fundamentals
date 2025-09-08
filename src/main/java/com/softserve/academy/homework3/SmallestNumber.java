package com.softserve.academy.homework3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third number: ");
        int c = input.nextInt();

        System.out.println("The smallest number is " + findSmallestNumber(a, b, c));
    }

    public static int findSmallestNumber(int a, int b, int c) {
        if (a > b && a > c) return a;
        if (b > a && b > c) return b;
        else return c;
    }
}
