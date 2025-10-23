package homework13;

import java.time.LocalDate;
import java.time.Month;

public class Task4 {
    private final LocalDate birthday = LocalDate.of(2003, Month.JULY, 11);

    public static void dayOfWeek(LocalDate birthday) {
        System.out.println("Day of Week: " + birthday.getDayOfWeek());
        System.out.println("Day of Week after 6 month: "+ birthday.plusMonths(6).getDayOfWeek());
        System.out.println("Day of Week after 12 month: "+ birthday.plusMonths(12).getDayOfWeek());
    }

    public static void main(String[] args) {
        Task4 tsk = new Task4();
        dayOfWeek(tsk.birthday);
    }
}
