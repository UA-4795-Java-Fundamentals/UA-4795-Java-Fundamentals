package com.softserve.academy.homework10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogChecker {
    public static boolean containsKeyword(String logLine, String keyword) {
        if (logLine == null || keyword == null || keyword.isEmpty()) {
            return false;
        }

        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(logLine);
        return matcher.find();
    }

    public static void main(String[] args) {
        System.out.println(containsKeyword("Test failed with ERROR at 12:00", "ERROR"));
        System.out.println(containsKeyword("NoErrorHere", "ERROR"));
        System.out.println(containsKeyword("ERROR123", "ERROR"));
        System.out.println(containsKeyword("123ERROR", "ERROR"));
        System.out.println(containsKeyword("error", ""));
    }
}
