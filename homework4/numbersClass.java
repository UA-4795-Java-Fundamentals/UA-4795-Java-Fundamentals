import java.util.Scanner;

public class numbersClass {
    private double number;

    public numbersClass() {
    }

    public double getNumber() {
        return number;
    }

    public double inPutNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        double number = scanner.nextDouble();
        this.number = number;
        return number;
    }

    public void check(double number1, double number2, double number3) {
        if (-5.0 <= number1 && number1 <= 5.0) {
            if (-5.0 <= number2 && number2 <= 5.0) {
                if (-5.0 <= number3 && number3 <= 5.0) {
                    System.out.println("YES!!!");
                } else {
                    System.out.println("NO!!!");
                }
            } else {
                System.out.println("NO!!!");
            }
        } else {
            System.out.println("NO!!!");
        }
    }
}



