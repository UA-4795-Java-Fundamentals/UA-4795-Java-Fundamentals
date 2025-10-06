package com.softserve.academy.module9.clas;

public class Animal {
    public void makeSound() {
        System.out.println("Some noize");
    }
}

class Demo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        };
        dog.makeSound();

        Animal cat = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        };
        cat.makeSound();

    }
}
