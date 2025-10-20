package com.softserve.academy.module13;

@FunctionalInterface
public interface GreetingService {
    void sayMessage(String massage);
    //   void printInfo(String info);// compile error

}

class MyGreetingService {
    public static void main(String[] args) {
        GreetingService msg1 = abc -> System.out.println("Hello my world, " + abc);
        GreetingService msg2 = (x) -> System.out.println("What is name " + x);
        msg1.sayMessage("Bob");
        msg2.sayMessage("Alice");

    }
}
