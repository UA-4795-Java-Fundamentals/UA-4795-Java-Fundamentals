package com.softserve.academy.module6.upcasting;

public class Animal {
    void makeSound() {
        System.out.println("Some sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof");
    }
}

class DemoAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        //animal.bark();//compile error
        Animal animal1 = new Dog();
        Dog dog = (Dog) animal1;
        dog.bark();

    }
}
