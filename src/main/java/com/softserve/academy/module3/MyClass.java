package com.softserve.academy.module3;

public class MyClass {
    public void printMessage() {
        System.out.println("No message provided");
    }

    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void printMessage(String message, String st) {
        System.out.println("Message: " + message + st);
    }

    public String printMessage(String st, double message) {
        return "Message: ";
    }

    public void printMessage (int a){
        System.out.println(a);

    }

    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.printMessage();
        myClass.printMessage("Hello all");
        myClass.printMessage("Hello", 3);
        myClass.printMessage(5);
    }
}