package com.softserve.academy.homework11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class EventReminder {
    public static final Consumer<LocalDate> REMINDER = date -> {
        if (date == null) {
            System.out.println("Date is null");
            return;
        }

        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), date);
        if (daysLeft > 0) {
            System.out.println(daysLeft + " days left until the event!");
        } else if (daysLeft == 0) {
            System.out.println("The event is today!");
        } else {
            System.out.println("The event has already passed!");
        }
    };

    public static void remind(LocalDate date) {
        REMINDER.accept(date);
    }

    public static void main(String[] args) {
        remind(LocalDate.of(2025, 3, 12));
        remind(LocalDate.now());
        remind(LocalDate.of(2025, 1, 1));
        remind(null);
    }
}
