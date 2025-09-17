package com.softserve.academy.module5;

import java.util.Arrays;
import java.util.Scanner;

public class ContinueExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array:");
        int numbersOfElements = sc.nextInt();
        int[] array = new int[numbersOfElements];
        int sum = 0;
        int n;
        for (int i = 0; i < numbersOfElements; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0) {
                continue;
            }
            sum += n;
            array[i] = n;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The array is: " + Arrays.toString(array));
        sc.close();

    }
}
