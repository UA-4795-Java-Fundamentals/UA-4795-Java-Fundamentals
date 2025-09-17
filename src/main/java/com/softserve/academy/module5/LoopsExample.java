package com.softserve.academy.module5;

import java.util.Arrays;

public class LoopsExample {
    public static void main(String[] args) {
        //While loop

        int counter = 5; //if counter = >10 -> Message after loop
        while (counter <= 10) {
            System.out.println("counter: " + counter);
            counter++;
        }
        System.out.println(counter);
        System.out.println("Message after loop");
        /*
        counter: 5
        counter: 6
        counter: 7
        counter: 8
        counter: 9
        counter: 10
        * */

        int i = 5;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i <= 10);
        System.out.println("final: " + i);
        System.out.println("The end of the loop");
        String[] names = {"John", "Jane", "Jack", "Jennie", "Anna"};
        // for loop
        for (int b = 3; b < names.length; b++) {
            System.out.println(names[b]);

        }
        // for each loop
        for (String name : names) {
            System.out.println(name);

        }

        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            number++;
            System.out.print(number + " ");
        }

        System.out.println(Arrays.toString(numbers));

        for (int j = 2; j < numbers.length; j++) {
            numbers[j] = numbers[j] * 2;
        }
        System.out.println(Arrays.toString(numbers));

        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //print by elements
        /*
         1 2 3
         4 5 6
         7 8 9
         */
        for (int k = 0; k < arrays.length; k++) {
            for (int l = 0; l < arrays[k].length; l++) {
                System.out.print(arrays[k][l] + " ");
            }
            System.out.println();
        }

        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }

    }
}
