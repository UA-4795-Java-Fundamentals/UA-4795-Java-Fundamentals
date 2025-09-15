package practicalTask3;
import java.util.Scanner;

public class NumAvgSumCalc {
    public static void main(String[] args) {
        System.out.println("Average and summary of 2 numbers calculator");
        int first = getNumber("Enter the first number: ");
        int second = getNumber("Enter the second number ");
        int sum = getTotal(first, second);
        double avg = getAverage(first, second);
        System.out.println("The sum of " + first + " and " + second +  " is " + sum + ".");
        System.out.println("The average of " + first + " and " + second +  " is " + avg + ".");
    }

    private static int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner scan = new Scanner(System.in);
        return  Integer.parseInt( scan.nextLine());
}
    private static double getAverage(int first, int second) {
        return getTotal(first, second) / 2.0;}

    private static int getTotal(int first, int second) {
        return first + second;
    }
}



