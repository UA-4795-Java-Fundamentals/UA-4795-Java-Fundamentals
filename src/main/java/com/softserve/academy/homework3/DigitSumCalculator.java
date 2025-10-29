package com.softserve.academy.homework3;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            int sum = 0;
            if (hundreds > 0) sum += hundreds;
            if (tens > 0) sum += tens;
            if (ones > 0) sum += ones;

            return sum;
        } else {
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }
}
