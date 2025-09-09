package M1HW1T;

import java.util.Scanner;

public class FlowerBedCalculator {

    public static void main(String[] args) {
        // 1. Объявление переменной radius
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус клумбы:");
        double radius = scanner.nextDouble(); // Используем double для более точных вычислений

        // 2. Расчет периметра (длины окружности)
        double perimeter = 2 * Math.PI * radius;

        // 3. Расчет площади
        double area = Math.PI * radius * radius; // Или Math.PI * Math.pow(radius, 2)

        // 4. Вывод результатов на консоль
        System.out.println("Периметр клумбы: " + perimeter);
        System.out.println("Площадь клумбы: " + area);

        scanner.close(); // Закрываем сканер
    }
}
