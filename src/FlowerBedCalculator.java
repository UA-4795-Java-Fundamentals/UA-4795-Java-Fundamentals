import java.util.Scanner;
public class FlowerBedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус клумби: ");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Периметр клумби: %.2f%n", perimeter);
        System.out.printf("Площа клумби: %.2f%n", area);
        scanner.close();
    }
}
