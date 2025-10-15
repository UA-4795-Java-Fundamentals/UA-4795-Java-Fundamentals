package homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        System.out.println("Enter USD amount(like $1.00)");
        String usd = sc.nextLine();
        Matcher matcher = pattern.matcher(usd);

        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("Amount of USD not found)");
        }


    }
}
