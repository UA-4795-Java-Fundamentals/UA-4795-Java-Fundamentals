package com.softserve.academy.homework6.birds;

public class Penguin extends NonFlyingBird {
    @Override
    void fly() {
        System.out.println("Ow, I can't fly, but I can swiiiim!");
    }
}
