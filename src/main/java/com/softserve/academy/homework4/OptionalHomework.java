package com.softserve.academy.homework4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class OptionalHomework {
    public static void main(String[] args) {
        // 1. ...
        double[] nums = new double[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three double numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }

        boolean isInRange = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < -5.0 || nums[i] > 5.0) {
                isInRange = false;
                break;
            }
        }
        if (isInRange)
            System.out.println("All numbers belong to the range [-5, 5].");
        else
            System.out.println("Not all numbers belong to the range [-5, 5].");

        // 2. Write a program that prompts the user to input three integer numbers.
        // The program should determine the maximum and minimum values among
        // the three numbers and output them to the console.
        int[] numbers = new int[3];
        System.out.print("\n\nPlease input 3 integer values ->> ");
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Minimum value is [" + numbers[0] + "], Maximum value is [" + numbers[numbers.length - 1] + "].");

        // 3. Write a program that prompts the user to input a number representing
        // an HTTP error (e.g., 400, 401, 402, etc.). The program should use an enum
        // called HTTPError to map the input number to the corresponding name of the error and output it.
        int errorCode;
        System.out.print("\n\nPlease enter your HTTP Error code ->> ");
        errorCode = sc.nextInt();
        if (HTTPError.fromCode(errorCode) != null)
            System.out.println("Too bad! You've encountered { " + HTTPError.fromCode(errorCode).getMessage() + " } error.");
        else
            System.out.println("Even worse! It's unknown error :(");

        // 4. Create a class called Dog ...
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Sparky", DogBreed.BEAGLE, 9);
        dogs[1] = new Dog("Max", DogBreed.GERMAN_SHEPHERD, 4);
        dogs[2] = new Dog("Lenny", DogBreed.FRENCH_BULLDOG, 8);

        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (i == j)
                    continue;
                if (Objects.equals(dogs[i].getName(), dogs[j].getName()))
                    System.out.println("\n\nThere are some dogs with the same name...");
            }
        }

        Dog.sortByAge(dogs);
        Dog oldestDog = dogs[0];
        System.out.println("\n\nOldest dog is " + oldestDog.getName() + ", " + oldestDog.getBreed());

        sc.close();
    }
}
