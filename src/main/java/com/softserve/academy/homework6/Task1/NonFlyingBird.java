package com.softserve.academy.homework6.Task1;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I cannot fly =(";
    }

    @Override
    public String toString() {
        return "My name is " + this.getClass().getSimpleName() + " and " + fly();
    }
}
