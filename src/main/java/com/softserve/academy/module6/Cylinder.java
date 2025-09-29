package com.softserve.academy.module6;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }


//    public double getArea (int a){
//        super.getArea();
//        System.out.println("111");
//        return 1;
//    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder";
    }
}
