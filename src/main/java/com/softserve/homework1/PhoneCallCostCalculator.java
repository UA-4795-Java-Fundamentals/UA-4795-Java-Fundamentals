package com.softserve.homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c1, c2, c3, t1, t2, t3;
        System.out.println("Enter cost per minute 1:");
        c1 = scanner.nextInt();
        System.out.println("Enter cost per minute 2");
        c2 = scanner.nextInt();
        System.out.println("Enter cost per minute 3:");
        c3 = scanner.nextInt();
        System.out.println("Enter duration time of call 1:");
        t1 = scanner.nextInt();
        System.out.println("Enter duration time of call 1:");
        t2 = scanner.nextInt();
        System.out.println("Enter duration time of call 1:");
        t3 = scanner.nextInt();
        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;
        int totalCost = cost1 + cost2 + cost3;
        System.out.println("Cost of call 1 - " + cost1);
        System.out.println("Cost of call 2 - " + cost2);
        System.out.println("Cost of call 3 - " + cost3);
        System.out.println("Total cost of call -  " + totalCost);
    }
}
