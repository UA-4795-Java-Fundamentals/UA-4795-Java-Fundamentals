package homework1;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        String name;
        String address;
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Where do you live, "+ name + "?");
        Scanner sc2 = new Scanner(System.in);
        address = sc2.nextLine();
        System.out.printf("Name: " + name + ", " + "Address " + address);
    }
}
