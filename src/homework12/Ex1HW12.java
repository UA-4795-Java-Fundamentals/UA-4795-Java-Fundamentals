import java.util.Scanner;

public class Ex1HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five words ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        if (words.length != 5) {
            System.out.println("Wrong input");
            return;
        }
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word is " + longestWord);
        char[] chars = longestWord.toCharArray();
        System.out.println("Number of characters in the longest word " + chars.length);
        String secondWord = words[1];
        String reversedSecond = new StringBuilder(secondWord).reverse().toString();
        System.out.println("Second Reverse " + reversedSecond);
        scanner.close();


    }
}

