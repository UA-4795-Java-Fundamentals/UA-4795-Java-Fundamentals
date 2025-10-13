package com.softserve.academy.homework8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int previous = -1;
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.print("Input number: ");
                int number = input.nextInt();
                if (number > previous) {
                    System.out.println(readNumber(number, 0, 100));
                    previous = number;
                }
            } catch (InputMismatchException e) {
                System.out.println("You can input only numbers!");
                input.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }

    public static int readNumber(int number, int start, int end) throws Exception {
        if (number >= end || number <= start) {
            throw new Exception("Number must be in ragne (" + start + ", " + end + ")!");
        }
        return number;
    }
}
