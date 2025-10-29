package com.softserve.academy.homework5;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {12, -20, 35, 64, -5, -60, 17, 32, 84, 100};

        int sum = calculateSum(array);
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
