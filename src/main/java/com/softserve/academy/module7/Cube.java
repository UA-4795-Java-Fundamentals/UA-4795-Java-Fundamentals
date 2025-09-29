package com.softserve.academy.module7;

class Cube extends Shape implements Vertexable, Volumetric {
    private final double side;

    public Cube(double side, String name) {
        this.side = side;
        this.name = name;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public int getNumberOfVertex() {
        return 12;
    }

    @Override
    public void info() {
       System.out.println("Cube");

    }
}
