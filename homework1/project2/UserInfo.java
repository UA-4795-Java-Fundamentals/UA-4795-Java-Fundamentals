import java.util.Scanner;

public class UserInfo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your address, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Name: " + name + ", Address:" + address);
        scanner.close();
    }
}
