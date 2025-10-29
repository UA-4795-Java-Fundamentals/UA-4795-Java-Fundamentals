package com.softserve.academy.homework5;

import java.util.Arrays;

public class PrintReverseSortedArray {
    private static void printReverseSortedArray(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);

        System.out.print("[");
        for (int i = sortedArray.length - 1; i >= 0; i--) {
            System.out.print(sortedArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
