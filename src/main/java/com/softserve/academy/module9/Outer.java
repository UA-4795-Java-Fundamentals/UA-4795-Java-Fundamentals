package com.softserve.academy.module9;


public class Outer {
    private String name;

    private class Inner implements Greeting {
        public void sayHello() {
            System.out.println("Hello from Inner class");
        }
    }

//    public void createInner() {
//        Inner inner = new Inner();
//        inner.sayHello();
//    }


    public Greeting getGreeting() {
        return new Inner();
    }
}


class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        // outer.createInner();

        // Outer.Inner inner = outer.new Inner();//compile error
        Greeting g = outer.getGreeting();
        g.sayHello();

    }
}

