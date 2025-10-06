package com.softserve.academy.module9;

public interface Greeting {

    void sayHello();
}

class FrendlyGreeting implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello! Nice to meet you!");
    }
}

class GreetingDemo {
    public static void main(String[] args) {
        Greeting g = new FrendlyGreeting();
        g.sayHello();

        Greeting goodBye = new Greeting() {
            @Override
            public void sayHello(){
                System.out.println("Good bye!");
            }
        };
        goodBye.sayHello();
    }
}