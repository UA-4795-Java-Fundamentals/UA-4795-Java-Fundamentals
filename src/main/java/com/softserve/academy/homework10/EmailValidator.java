package com.softserve.academy.homework10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9._%+-]+@" +
                    "(?:[A-Za-z0-9-]+\\.)+" +
                    "[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("student@example.com"));
        System.out.println(isValidEmail("wrong@@example"));
        System.out.println(isValidEmail("user.name@domain.net"));
        System.out.println(isValidEmail(null));
        System.out.println(isValidEmail("user@domain"));
    }
}
