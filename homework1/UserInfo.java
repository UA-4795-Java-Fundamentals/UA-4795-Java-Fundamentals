import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name?:");
        String name = input.nextLine();

        System.out.print("Where do you live" + name + "?:");
        String address = input.nextLine();

        System.out.print("Name: " + name + " ,Address: "  + address + "?");

    }
}
