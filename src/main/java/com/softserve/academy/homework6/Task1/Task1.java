package com.softserve.academy.homework6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Kiwi();
        birds[2] = new Swallow();
        birds[3] = new Penguin();

        for (Bird bird : birds) {
            System.out.println(bird + "\n");
        }
    }
}
