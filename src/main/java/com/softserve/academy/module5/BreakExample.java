package com.softserve.academy.module5;

import java.util.Arrays;
import java.util.Scanner;

public class BreakExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array:");
        int numbersOfElements = sc.nextInt();
        int[] arr = new int[numbersOfElements];
        int  n = 0;
        for (int i = 0; i < numbersOfElements; i++) {
            System.out.println("Input number: ");
            n = sc.nextInt();
            if (n < 0) {
                break;
            }
            System.out.println("i: " + i);
            arr[i] = n;
        }
        System.out.println("final value of n is: " + n);
        System.out.println("final arr: " + Arrays.toString(arr));
        sc.close();
    }
}
