package com.softserve.academy.module6;

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(40);
        rectangle.setHeight(70);

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setWidth(40);
        parallelogram.setHeight(70);
        parallelogram.setAngle(35);

        int perimeterOfRectangle = rectangle.getPerimeter();
        int perimeterOfParallelogram = parallelogram.getPerimeter();
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
        System.out.println("Perimeter of Parallelogram: " + perimeterOfParallelogram);

        double areaOfParallelogram = parallelogram.getArea();
       // int areaOfRectangle = rectangle.getArea();//exception
        System.out.println("Area of Parallelogram: " + areaOfParallelogram);

    }
}
