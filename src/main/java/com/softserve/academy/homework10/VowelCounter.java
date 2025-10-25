package com.softserve.academy.homework10;

public class VowelCounter {
    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World"));
        System.out.println(countVowels("AEIOU"));
        System.out.println(countVowels(""));
        System.out.println(countVowels(null));
        System.out.println(countVowels("bcdfg"));
    }
}
