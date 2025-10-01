package com.softserve.academy.module8;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hello");
        //long[] arrays = new long[Integer.MAX_VALUE];//OutOfMemoryError
        try {
            long[] arrays = new long[Integer.MAX_VALUE];
            //Thread.sleep(1000);
        } catch (Error e) {
            System.out.println("Get message: " + e.getMessage());
        }
        finally {
            System.out.println("From finally");
        }
        System.out.println("Good bye!");
    }
}
