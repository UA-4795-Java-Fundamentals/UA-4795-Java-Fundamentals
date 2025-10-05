package com.softserve.academy.homework6.Task1;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract String fly();
}
