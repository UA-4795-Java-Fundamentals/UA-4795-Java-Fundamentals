package homework1;

import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int c1, c2, c3;
        double t1, t2, t3;
        Scanner costCall = new Scanner(System.in);
        Scanner time = new Scanner(System.in);
        // ========================================
        System.out.println("Enter 1st cost per minute");
        c1 = costCall.nextInt();
        System.out.println("Enter 2nd cost per minute");
        c2 = costCall.nextInt();
        System.out.println("Enter 3rd cost per minute");
        c3 = costCall.nextInt();
        System.out.println("Enter 1st call duration");
        t1 = time.nextDouble();
        System.out.println("Enter 2nd call duration");
        t2 = time.nextDouble();
        System.out.println("Enter 3rd call duration");
        t3 = time.nextDouble();
        System.out.println("Calculating costs");
        //==========================================
         double cost1 = c1 * t1;
         double cost2 = c2 * t2;
         double cost3 = c3 * t3;
       double totalcost = cost1 + cost2 + cost3;
        System.out.println("cost of first call is: " + cost1);
        System.out.println("Cost of second call is: " + cost2);
        System.out.println("Cost of third call is: " + cost3);
        System.out.println("Total cost: " + totalcost);
    }
}
