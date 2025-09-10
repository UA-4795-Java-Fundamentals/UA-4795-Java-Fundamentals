package homework2.run;

import homework2.SmallestNumber;

import java.util.Scanner;

public class RunSmallestNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = num.nextInt();
        System.out.println("Enter second number");
        int secondNum = num.nextInt();
        System.out.println("Enter third number");
        int thirdNum = num.nextInt();
        num.close();

        SmallestNumber sm = new SmallestNumber(firstNum, secondNum, thirdNum);
        sm.setA(firstNum);
        sm.setB(secondNum);
        sm.setC(thirdNum);

        System.out.println("Input side 1: " + sm.getA());
        System.out.println("Input side 2: " + sm.getB());
        System.out.println("Input side 3: " + sm.getC());
        sm.findSmallestNumber();
    }
}
