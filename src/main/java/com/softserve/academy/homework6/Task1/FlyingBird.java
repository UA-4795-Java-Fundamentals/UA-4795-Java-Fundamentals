package com.softserve.academy.homework6.Task1;

public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "I can fly ;)";
    }

    @Override
    public String toString() {
        return "My name is " + this.getClass().getSimpleName() + " and " + fly();
    }
}
