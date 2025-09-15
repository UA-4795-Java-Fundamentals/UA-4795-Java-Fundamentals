package com.softserve.academy.module3;

public class StaticDemo {
    static String welcomeMessage;

    //static block
    static {
        welcomeMessage = "Hello group 4795";
        System.out.println(welcomeMessage);
    }

    public static void main(String[] args, int b) {
        System.out.println("Method main started");
        System.out.println("Hello");

    }

    static {
        System.out.println("Good bye");
    }
}
