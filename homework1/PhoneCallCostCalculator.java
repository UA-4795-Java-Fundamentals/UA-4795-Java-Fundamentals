import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        int  c1;// ціле число змінна c1
        int  c2;
        int  c3;
        int  t1;
        int  t2;
        int  t3;
        System.out.print("Введіть c1:");
        Scanner input = new Scanner(System.in);
        c1 = input.nextInt();

        System.out.print("Введіть c2:");
        c2 = input.nextInt();

        System.out.print("Введіть c3:");
        c3 = input.nextInt();

        System.out.print("Введіть t1:");
        t1 = input.nextInt();

        System.out.print("Введіть t2:");
        t2 = input.nextInt();

        System.out.print("Введіть t3:");
        t3 = input.nextInt();

        int cost1 = c1 * t1;
        int cost2 = c2 * t2;
        int cost3 = c3 * t3;

        int totalCost = cost1 + cost2 + cost3;

        System.out.println("Вартість дзвінка 1:" + cost1);
        System.out.println("Вартість дзвінка 2:" + cost2);
        System.out.println("Вартість дзвінка 3:" + cost3);
        System.out.println("Загальна вартість:" + totalCost);


    }
}
