package com.softserve.academy.homework5;

import java.util.Scanner;

public class SumAndProductNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("Enter 10 inter numbers");

        for (int i = 0; i < 10; i++) {
            num[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (num[i] > 0) {
                sum += num[i];
            }
        }
        System.out.println("Sum  first 5 positive elements - " + sum);

        int product = 1;
        for (int i = 5; i < 10; i++) {
            if (num[i] < 0) {
                product *= num[i];
            }
        }
        if (product == 1) {
            product = 0;
        }
        System.out.println("Product last 5 negative elements - " + product);

        scanner.close();
    }
}

