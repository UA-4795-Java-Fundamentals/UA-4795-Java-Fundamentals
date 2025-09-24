package com.softserve.academy.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third number: ");
        int c = input.nextInt();

        displayMaximumMinimum(a, b, c);
    }

    public static void displayMaximumMinimum(int a, int b, int c){
        int maximum = Math.max(a,Math.max(b,c));
        int minimum = Math.min(a,Math.min(b,c));

        System.out.println("Max: " + maximum + " | "  + "Min: " + minimum);
    }
}
