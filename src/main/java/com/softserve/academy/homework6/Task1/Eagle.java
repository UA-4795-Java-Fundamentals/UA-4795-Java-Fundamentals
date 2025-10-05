package com.softserve.academy.homework6.Task1;

public class Eagle extends FlyingBird {
    public Eagle() {
        super(true, true);
    }

    @Override
    public String toString() {
        return super.toString() + "\nI'm the best in the sky";
    }
}
