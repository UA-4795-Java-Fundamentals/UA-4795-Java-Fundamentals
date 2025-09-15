package com.softserve.academy.module3;

public class Helper {
    private static String message;

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}


