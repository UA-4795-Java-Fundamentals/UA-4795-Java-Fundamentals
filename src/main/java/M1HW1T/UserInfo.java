package M1HW1T;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        // 1. Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Объявляем строковые переменные для имени и адреса
        String name;
        String address;

        // 3. Выводим вопрос и считываем имя
        System.out.print("Как вас зовут? ");
        name = scanner.nextLine(); // Считываем строку, введенную пользователем

        // 4. Выводим вопрос с именем и считываем адрес
        System.out.print("Где вы живете, " + name + "? ");
        address = scanner.nextLine(); // Считываем строку с адресом

        // 5. Выводим полную информацию в заданном формате
        System.out.println("Имя: " + name + ", Адрес: " + address);

        // Закрываем объект Scanner, чтобы освободить системные ресурсы
        scanner.close();
    }
}

