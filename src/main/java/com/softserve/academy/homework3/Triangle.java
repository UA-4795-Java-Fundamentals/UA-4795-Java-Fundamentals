package com.softserve.academy.homework3;

public class Triangle {
    private int side1, side2, side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double perimeter = (side1 + side2 + side3) * 0.5;
        return Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    }
}
