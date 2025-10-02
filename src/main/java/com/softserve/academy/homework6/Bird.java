package com.softserve.academy.homework6;

public abstract class Bird {

    protected String feathers;
    protected boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();

    public void info() {
        System.out.println(this.getClass().getSimpleName() + ": " + feathers + ", Lay eggs: " + layEggs);
    }
}
class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " can fly!");
    }
}
class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " can't fly!");
    }
}

class Eagle extends FlyingBird {

    public Eagle() {
        super("Brown feathers", true);
    }
}

class Swallow extends FlyingBird {

    public Swallow() {
        super("Grey feathers", true);
    }
}

class Penguin extends NonFlyingBird {

    public Penguin() {
        super("Black and white feathers", true);
    }
}
class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Dark feathers", true);
    }
}
 class BirdDemo {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };
        for (Bird bird : birds) {
            bird.info();
            bird.fly();
        }
    }
}