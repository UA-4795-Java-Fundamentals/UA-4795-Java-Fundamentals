package com.softserve.academy.homework8;

import java.util.Scanner;

public class ReadNumberDemo {
    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in range [" + start + "..." + end + "]: ");
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            if (number < start || number > end) {
                throw new Exception("Number is out of range [" + start + ", " + end + "]");
            }
            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid  input. Must be integer number!");
        }
    }

    public static void main(String[] args) {
        final int START = 1;
        final int END = 100;
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers in the range [1...100]:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    numbers[i] = readNumber(START, END);
                    break;
                } catch (Exception e) {
                    System.out.println("Exception:  " + e.getMessage());
                }
            }
        }
        System.out.println("Entered numbers: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
