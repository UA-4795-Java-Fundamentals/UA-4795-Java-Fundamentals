package com.softserve.academy.module12;

public class QuoteAnalyzer {
    public static void main(String[] args) {
        String quote = " “  The only limit   to our realization of tomorrow is our doubts of today.” ";
        System.out.println("Origin text");
        System.out.println(quote);
        analyze(quote);

    }

    private static void analyze(String text) {
        String cleaned = text.strip()
                .replaceAll("[“”\"]","")
                .replaceAll("\\s+"," ");


        System.out.println(cleaned);
        int length = cleaned.length();
        String[] words = cleaned.split(" ");

        long uniqueLetters = cleaned
                .toLowerCase()
                        .codePoints()
                                .filter(Character::isLetter)
                                        .distinct()
                                                .count();

        long spaces = cleaned.chars().filter(ch -> ch == ' ').count();



        System.out.println("Length: " + length);
        System.out.println("Numbers of words: " + words.length);
        System.out.println("Unique letters: " + uniqueLetters);
        System.out.println(spaces);
        System.out.println(cleaned.startsWith("The"));
        System.out.println(cleaned.startsWith(" The"));
        System.out.println(cleaned.endsWith("today."));
        System.out.println(cleaned.toUpperCase());
        System.out.println("\uD83D\uDC49" + cleaned + "\uD83D\uDC49");
    }
}
