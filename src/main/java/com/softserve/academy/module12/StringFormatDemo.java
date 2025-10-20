package com.softserve.academy.module12;

import java.time.LocalDateTime;

public class StringFormatDemo {

    public static void main(String[] args) {
        String name = "Alice";
        int age = 18;
        double balance = 123456.7890;
        boolean active = false;
        LocalDateTime today = LocalDateTime.now();


        String report = """
                👤 Name: %-10s
                🎂 Age: %+5d
                💰 Balance: %,.2f USD
                🔓 Active: %b
                🕒 Time: %5$tF %5$tT
                
                """.formatted(name, age, balance, active, today);

        System.out.println(report);


        System.out.printf("|%10s|%n", "Java");  // |      Java|
        System.out.printf("|%-10s|%n", "Java"); // |Java      |
        System.out.println("|%010d|".formatted(42));     // |0000000042|

        System.out.printf("%+d%n", 42);  // +42
        System.out.printf("%,d%n", 1000000); // 1,000,000
        System.out.printf("%(d%n", -42); // (42)
        System.out.printf("%.3f%n", 3.1415926); // 3.142
        System.out.println("%.2s".formatted("Java"));    // Ja

        String str = "Name: %s, Age: %d, Score: %.1f".formatted("Alice", 18, 92.634);
        System.out.println(str);

        String result = "%1$s your scored is %2$.1f points in %1$s's test.".formatted("Olha", 92.668);
        System.out.println(result);
    }
}
