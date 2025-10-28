import java.util.Scanner;

public class Ex2HW12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence ");
        String sentence = scanner.nextLine();
        String words = sentence.replaceAll(" +", " ");
        System.out.println(words);
    }
}
