package com.softserve.academy.homework3;

import java.util.Scanner;

public class SmallestOfThree {
    private int a, b, c;

    public void inputNumbers () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.print("Enter the third number: ");
        c = sc.nextInt();
    }

    public int solve () {
        return Math.min(Math.min(a, b), c);
    }
}
