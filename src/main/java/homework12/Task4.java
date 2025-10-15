package homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z\\s-]*$");
        boolean isValid = false;
        String firstname = "";
        String lastname = "";
        while (!isValid) {
            System.out.println("Please enter your first name: ");
            firstname = sc.nextLine().trim();

            System.out.println("Please enter your surname: ");
            lastname = sc.nextLine().trim();

            Matcher firstName = pattern.matcher(firstname);
            Matcher surname = pattern.matcher(lastname);

            if(firstName.matches() && surname.matches()) {
                isValid = true;
            } else {
                System.out.println("Invalid input! Please use only English letters, spaces, and hyphens.");
            }
        }
        String[] greetings = {
                "Welcome aboard, %s %s! We're thrilled to have you here!",
                "Hello %s %s! It's a beautiful day to start something new!",
                "Hey there, %s %s! Ready for an amazing adventure?",
                "Greetings, %s %s! Your presence makes this day special!",
                "Hi %s %s! Great things are waiting for you!",
                "Welcome, %s %s! Let's make today unforgettable!"
        };
        int randomIndex = (int) (Math.random() * greetings.length);

        System.out.printf("\n" + greetings[randomIndex] +"\n", firstname, lastname);

    }
}
