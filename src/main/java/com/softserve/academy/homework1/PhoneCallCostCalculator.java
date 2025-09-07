package com.softserve.academy.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        double c1, c2, c3;
        int t1, t2, t3;
        double cost1, cost2, cost3, totalCost;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter cost per minute for Call #1 -> ");
        c1 = input.nextDouble();
        System.out.print("Please enter cost per minute for Call #2 -> ");
        c2 = input.nextDouble();
        System.out.print("Please enter cost per minute for Call #3 -> ");
        c3 = input.nextDouble();

        System.out.print("Please enter duration for Call #1 -> ");
        t1 = input.nextInt();
        System.out.print("Please enter duration for Call #2 -> ");
        t2 = input.nextInt();
        System.out.print("Please enter duration for Call #3 -> ");
        t3 = input.nextInt();

        cost1 = c1 * t1;
        cost2 = c2 * t2;
        cost3 = c3 * t3;

        totalCost = cost1 + cost2 + cost3;

        System.out.printf("""
                ================
                Cost for Call #1: %.2f
                Cost for Call #2: %.2f
                Cost for Call #3: %.2f
                Total Cost: %.2f
                ================
                """, cost1, cost2, cost3, totalCost);
    }
}
