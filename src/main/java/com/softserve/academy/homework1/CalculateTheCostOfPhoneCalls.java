package com.softserve.academy.homework1;

import java.util.Scanner;

public class CalculateTheCostOfPhoneCalls {
    public static void main(String[] args) {
        double c1, c2, c3;
        int t1, t2, t3;
        double cost1, cost2, cost3, totalCost;
        Scanner input = new Scanner(System.in);

        System.out.print("Input cost per minute for the 1 call: ");
        c1 = input.nextDouble();
        System.out.print("Input cost per minute for the 2 call: ");
        c2 = input.nextDouble();
        System.out.print("Input cost per minute for the 3 call: ");
        c3 = input.nextDouble();
        System.out.print("Input duration of the 1 call: ");
        t1 = input.nextInt();
        System.out.print("Input duration of the 2 call: ");
        t2 = input.nextInt();
        System.out.print("Input duration of the 3 call: ");
        t3 = input.nextInt();

        cost1 = c1 * t1;
        System.out.println("Cost for 1st call: " + cost1);
        cost2 = c2 * t2;
        System.out.println("Cost for 2nd call: " + cost2);
        cost3 = c3 * t3;
        System.out.println("Cost for 3d call: " + cost3);

        totalCost = cost1 + cost2 + cost3;
        System.out.println("Total Cost: " + totalCost);
    }
}
