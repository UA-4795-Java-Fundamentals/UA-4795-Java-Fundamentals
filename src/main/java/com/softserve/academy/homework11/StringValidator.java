package com.softserve.academy.homework11;

import java.util.function.Predicate;

public class StringValidator {
    public static final Predicate<String> IS_VALID = s -> s != null && !s.isEmpty() && s.length() >= 5;

    public static boolean validate(String s) {
        return IS_VALID.test(s);
    }
}
