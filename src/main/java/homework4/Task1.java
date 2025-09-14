package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first double number");
        double firstDouble = sc.nextDouble();
        System.out.println("Input second double number");
        double secondDouble = sc.nextDouble();
        System.out.println("Input third double number");
        double thirdDouble = sc.nextDouble();
        sc.close();

        if (firstDouble >= -5 && firstDouble <= 5 &&
                secondDouble >= -5 && secondDouble <= 5 &&
                thirdDouble >= -5 && thirdDouble <= 5) {
            System.out.println("All numbers belongs to range [-5 : 5]");
        }else {
            System.out.println("Fail: Not all numbers belongs to range [-5 : 5]");
        }



    }
}
