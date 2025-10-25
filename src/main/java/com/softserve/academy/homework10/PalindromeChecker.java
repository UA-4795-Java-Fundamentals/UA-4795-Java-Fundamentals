package com.softserve.academy.homework10;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String cleaned = text.replace(" ", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Race car"));         // true
        System.out.println(isPalindrome("Hello"));            // false
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
        System.out.println(isPalindrome(""));                 // true (empty string is a palindrome)
        System.out.println(isPalindrome(null));               // false
    }
}
