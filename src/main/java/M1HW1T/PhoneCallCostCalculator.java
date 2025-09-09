package M1HW1T;
import java.util.Scanner;

public class PhoneCallCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите стоимость минуты для звонка №" + i + ":");
            double costPerMinute = scanner.nextDouble();

            System.out.println("Введите длительность звонка №" + i + " в минутах:");
            double duration = scanner.nextDouble();

            double cost = costPerMinute * duration;
            totalCost += cost;
        }

        System.out.println("Общая стоимость трёх звонков: " + totalCost);
    }
}
