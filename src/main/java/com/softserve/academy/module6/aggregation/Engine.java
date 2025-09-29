package com.softserve.academy.module6.aggregation;

public class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Engine has model " + model);
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("The car is running!");
        engine.start();
    }
}

class DemoCar {
    public static void main(String[] args) {
        Engine engine = new Engine("v4");
        Car car = new Car(engine);

        car.drive();
    }
}