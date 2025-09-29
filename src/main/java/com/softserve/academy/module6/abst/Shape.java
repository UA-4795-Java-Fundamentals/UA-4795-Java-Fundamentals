package com.softserve.academy.module6.abst;

import java.awt.*;

public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}

class Point{
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class Square extends Shape{
    private Point center;
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(Point center, double side) {
        this.center = center;
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}


class Parallelogram extends Shape {
    private final double  width;
    private final double height;
    private final double angle;

    public Parallelogram(double width, double height, double angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return (width * height * Math.sin(angle * Math.PI / 180));
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "width=" + width +
                ", height=" + height +
                ", angle=" + angle +
                '}';
    }
}
