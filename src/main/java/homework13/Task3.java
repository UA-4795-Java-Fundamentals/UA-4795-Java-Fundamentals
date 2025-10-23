package homework13;

import java.time.LocalDate;

public class Task3 {
    public static void main(String[] args) {
        isLeapYear(LocalDate.now());
    }

    public static void isLeapYear(LocalDate year){
        if(year.isLeapYear()){
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
