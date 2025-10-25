package com.softserve.academy.homework10;

public class WordReverser {
    public static String reverseWords(String text) {
        if (text == null) return null;
        if (text.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                word.append(c);
            } else {
                result.append(word.reverse());
                word.setLength(0);
                result.append(c);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is fun"));
        System.out.println(reverseWords("Hello World"));
        System.out.println(reverseWords(""));
        System.out.println(reverseWords(null));
        System.out.println(reverseWords("SingleWord"));
    }
}
