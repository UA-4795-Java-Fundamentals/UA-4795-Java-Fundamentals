import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть радіус:");
        int radius = input.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}