package com.softserve.academy.module7;

public class Sphere extends Shape implements Volumetric {
    private final double radius;

    public Sphere(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void info() {
        System.out.println("Sphere");
    }
}
