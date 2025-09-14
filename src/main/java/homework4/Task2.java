package homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first integer number");
        int firstInt = sc.nextInt();
        System.out.println("Input second integer number");
        int secondInt = sc.nextInt();
        System.out.println("Input third integer number");
        int thirdInt = sc.nextInt();
        sc.close();

        minmax(firstInt, secondInt, thirdInt);
    }

    public static void minmax(int firstInt, int secondInt, int thirdInt){
        int max = firstInt;
        if(secondInt > max){max = secondInt;}
        if(thirdInt > max){max = thirdInt;}

        int min = firstInt;
        if(secondInt < min){min = secondInt;}
        if(thirdInt < min){min = thirdInt;}

        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }


}
