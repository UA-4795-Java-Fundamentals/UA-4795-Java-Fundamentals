package homework12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input sentence with 5 words");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        if(words.length != 5){
            System.out.println("Please enter 5 words");
        }


        String longest = words[0];
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        int longestLength = longest.length();

        String secondWord = words[1];
        String reversedSecond = new StringBuilder(secondWord).reverse().toString();

        System.out.println("Longest word: " + longest);
        System.out.println("Number of letters for the found word: " + longestLength);
        System.out.println("Second word in reversed order: " + reversedSecond);
    }
}
