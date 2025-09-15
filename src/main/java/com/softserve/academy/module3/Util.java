package com.softserve.academy.module3;

public class Util {
    public static void print(int... messages) {
        System.out.println(messages);
        for (Object msg : messages) {
            System.out.println(msg);
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Student student = new Student("Anna", "Demkiv", 18);
        Util.print(10, 20, 30, 40, 0);
    }
}
