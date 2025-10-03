package homework8;

import java.util.Scanner;

public class FlowerBedCalculatorUpdated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the flower bed ");
        boolean validInput = true;
        double radius = 0;
        try {
            radius = input.nextDouble();
        } catch (Exception e) {
            System.err.println("Error: " + e.getClass().getSimpleName() + ", Please enter a number");
            validInput = false;

        }
        if (validInput) {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        }
        input.close();
    }
}
