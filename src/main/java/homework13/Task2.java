package homework13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(validateDate("07.01.25"));
        System.out.println(validateDate("13.11.23"));
    }

    public static boolean validateDate(String dateString) {
        try {
            LocalDate.parse(dateString, DateTimeFormatter.ofPattern("MM.dd.yy"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
