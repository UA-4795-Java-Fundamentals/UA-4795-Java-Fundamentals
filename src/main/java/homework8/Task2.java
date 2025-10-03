package homework8;

import java.util.Scanner;

public class Task2 {

    public static int readNumber(int start, int end) throws IndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + start + " and " + end + ": ");

        try{
            int number = sc.nextInt();
            if(number < start || number > end){
                throw new IndexOutOfBoundsException("Error: number out of range");
            }
            return number;
        }catch(NumberFormatException e){
            throw new NumberFormatException("Invalid input! Not a number.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int start = 1;
        int end = 99;
        System.out.println("Please enter 10 numbers such that " + start + "< a1 < a2 < ... < a10 < " + end);

        for (int i = 0; i < numbers.length; i++) {
            while(true){
                try{
                    int number = readNumber(start, end);

                    if(i > 0 && number <= numbers[i-1]){
                        System.out.println("Number must be greater than previous");
                        continue;
                    }
                    numbers[i] = number;
                    break;
                } catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        System.out.println("Your numbers: ");
        for(int n : numbers){
            System.out.println(n + " ");
        }
    }
}
