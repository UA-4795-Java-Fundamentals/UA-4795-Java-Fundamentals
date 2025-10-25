package com.softserve.academy.homework11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateFormatterFn {
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static final Function<LocalDate, String> FORMATTER_FN = date ->
            date == null ? null : date.format(FORMATTER);

    public static String format(LocalDate date) {
        return FORMATTER_FN.apply(date);
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 3, 12);
        System.out.println(format(date));
    }
}
