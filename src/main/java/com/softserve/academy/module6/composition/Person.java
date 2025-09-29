package com.softserve.academy.module6.composition;

public class Person {
    private final Hart heart;

    public Person() {
        this.heart = new Hart();
    }
    public void live(){
        System.out.println("Person is alive");
        heart.beat();
    }
}
class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.live();
    }
}