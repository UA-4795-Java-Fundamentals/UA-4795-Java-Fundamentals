package com.softserve.academy.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third number: ");
        int c = input.nextInt();

        if (checkRange(a, b, c)) {
            System.out.println("All three numbers are within the range");
        }
        else {
            System.out.println("At least one number is not in the range");
        }
    }

    public static boolean checkRange(int a, int b, int c) {
        if (a > 5 || a < -5) return false;
        if (b > 5 || b < -5) return false;
        return c <= 5 && c >= -5;
    }
}
