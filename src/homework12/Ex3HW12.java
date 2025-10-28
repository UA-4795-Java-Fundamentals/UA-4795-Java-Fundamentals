import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3HW12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d+");
        System.out.println("Enter sum ");
        String usd = sc.nextLine();
        Matcher matcher = pattern.matcher(usd);
        while (matcher.find()) {
            System.out.printf("$%s.00%n" ,matcher.group());
        }
        sc.close();
    }
}
