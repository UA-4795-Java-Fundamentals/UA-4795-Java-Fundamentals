package com.softserve.academy.homework5;

import java.util.Scanner;

public class ArrayFiveIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int secondPositive = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                if (count == 2) {
                    secondPositive = i;
                    break;
                }

            }
        }
        if (secondPositive != -1) {
            System.out.println("Position of second positive number: " + secondPositive);
        } else {
            System.out.println("No second positive number!");
        }
        int minValue = arr[0];
        int minValuePos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minValuePos = i;
            }
        }
        System.out.println("Minimum value: " + minValue + " at position: " + minValuePos);

        int product = 1;
        boolean hasEven = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                product *= arr[i];
                hasEven = true;
            }
        }
        if (hasEven) {
            System.out.println("Product of even numbers in array: " + product);

        } else {
            System.out.println("No even numbers in array!");

        }
        scanner.close();
    }
}
