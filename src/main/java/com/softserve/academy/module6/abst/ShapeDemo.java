package com.softserve.academy.module6.abst;



public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Parallelogram(10,12,35),
                new Square(25),
                new Square(10)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.getShapeName());
        }

        Square square = new Square(new Point(73,12), 26);
        System.out.println();

        double d = 10.5;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);


    }
}
