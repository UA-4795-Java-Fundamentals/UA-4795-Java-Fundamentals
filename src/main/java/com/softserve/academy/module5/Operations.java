package com.softserve.academy.module5;

public class Operations {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, -5, 8, 9, 11, 100, -17, 101};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println( "Sum: " + sum );

        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        System.out.println( "Product: " + product );

        int amount = 0;
        for (int x : arr) {
            if (x >= 8 && x <= 100) {
                amount++;
            }
        }
        System.out.println( "Amount: " + amount );
    }
}
