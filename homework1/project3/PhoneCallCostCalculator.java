import java.util.Scanner;

public class PhoneCallCostCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cost per minute for 1 call: ");
        double c1 = scanner.nextDouble();
        System.out.print("Duration of 1 call: ");
        double t1 = scanner.nextDouble();

        System.out.print("Cost per minute for 2 call: ");
        double c2 = scanner.nextDouble();
        System.out.print("Duration of 2 call: ");
        double t2 = scanner.nextDouble();

        System.out.print("Cost per minute for 3 call: ");
        double c3 = scanner.nextDouble();
        System.out.print("Duration of 3 call: ");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        double totalcost = cost1 + cost2 + cost3;

        System.out.println("Cost of the 1 call:" + cost1);
        System.out.println("Cost of the 2 call:" + cost2);
        System.out.println("Cost of the 3 call:" + cost3);
        System.out.println("Total cost is:" + totalcost);


        scanner.close();
    }
}
