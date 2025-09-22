import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца");

        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 | monthNumber > 12) {
            System.out.println("Такого месяца не существует");
        } else {
            System.out.println(month[monthNumber]);
        }
    scanner.close();
    }

}


