package com.softserve.academy.homework6.birds;

public class BirdsMain {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            System.out.println("\nMy name is " + bird.getClass().getSimpleName() + ". Can I fly?");
            bird.fly();
        }
    }
}
