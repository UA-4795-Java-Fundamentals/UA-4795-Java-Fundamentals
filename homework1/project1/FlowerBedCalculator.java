import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        double perimeter;
        double area;
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        scanner.close();


    }

}
