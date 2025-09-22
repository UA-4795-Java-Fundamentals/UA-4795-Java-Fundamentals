import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        do {
            int j = 0;
            j++;
            System.out.print("Введите первое число ");
            int number1 = scanner.nextInt();
            System.out.print("Введите второе число ");
            int number2 = scanner.nextInt();
            int sum = number1+number2;
            System.out.println("Сумма " + sum);
            System.out.print("Хотите повторить? True/False ");
            repeat = scanner.nextBoolean();
        } while(repeat == true);

        scanner.close();
    }
}

