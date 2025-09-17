package com.softserve.academy.module5;

import java.util.Arrays;

public class MaximumValueFinder {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 23, 44, 5, 64, 7, 108, -9};
        int max = arr[0]; //max element at start =-1
        int imax = 0; //index of this element
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.println("Maximum value is " + max);
        System.out.println("Maximum value is at index " + imax);

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Min value is " + arr[0]);
        System.out.println("Max value is " + arr[arr.length - 1]);

        int index = Arrays.binarySearch(arr, 108);
        System.out.println("Max value is at index " + index);

    }
}
