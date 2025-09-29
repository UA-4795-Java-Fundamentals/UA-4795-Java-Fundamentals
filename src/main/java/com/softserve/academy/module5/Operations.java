package com.softserve.academy.module5;

import com.softserve.academy.module3.Student;

import java.util.Arrays;

public class Operations {
    public static void main(String[] args) {
        int[] arr = {1, 5, -3, -5, 8, 9, 11, 100, -17, 101};

        int[] arrCopy = Arrays.copyOf(arr, 15);
        System.out.println(Arrays.toString(arrCopy));

        System.out.println(Arrays.equals(arr, arrCopy));

        int[] arr1 = {5, 1, -3, -5, 8, 9, 11, 100, -17, 101};
        System.out.println(Arrays.equals(arr, arr1));

        int[] numbers = new int[5];
        Arrays.fill(numbers, 1);
        System.out.println(Arrays.toString(numbers));

        Student[] group1 = {
                new Student("John", "Smith", 19),
                new Student("Jane", "Smith", 18),
        };

        Student[] group2 = {
                new Student("Anna", "Smith", 19),
                new Student("Bohdan", "Smith", 18),
        };

        Student[] group3 = {
                new Student("John", "Smith", 19),
                new Student("Jane", "Smith", 18),
        };

        System.out.println(Arrays.equals(group1, group3));
        System.out.println(Arrays.equals(group1, group2));


//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println( "Sum: " + sum );
//
//        int product = 1;
//        for (int i = 0; i < arr.length; i++) {
//            product *= arr[i];
//        }
//        System.out.println( "Product: " + product );
//
//        int amount = 0;
//        for (int x : arr) {
//            if (x >= 8 && x <= 100) {
//                amount++;
//            }
//        }
//        System.out.println( "Amount: " + amount );
    }
}
