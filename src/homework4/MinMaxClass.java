import java.util.Scanner;

public class MinMaxClass {
    private int intNumber;

    public MinMaxClass() {
    }

    public int getIntNumber() {
        return intNumber;
    }

    public int inPutIntNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        intNumber = scanner.nextInt();
        return intNumber;
    }
    public void minMax(int intNumber1, int intNumber2, int intNumber3){
        System.out.println("Min number: " + Math.min(Math.min(intNumber1, intNumber2), intNumber3));
        System.out.println("Max number: " + Math.max(Math.max(intNumber1, intNumber2), intNumber3));
    }

}
