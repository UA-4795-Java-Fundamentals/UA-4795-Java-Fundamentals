package homework12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String result = sentence.replaceAll(" +", " ");

        System.out.println(sentence);
        System.out.println(result);
    }
}
// I  am     learning      Java      Fundamental