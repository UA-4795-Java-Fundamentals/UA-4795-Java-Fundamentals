package com.softserve.academy.module3;

public class Rhombu {
    private double side;
    private double height;

    public Rhombu(double side, double height) {
        this.side = side;
        this.height = height;
    }


    public double getArea (){
        return side * height;
    }
    public  double getPerimeter(){
        return 4 * side;
    }
}

class DemoRhombu{
    public static void main(String[] args) {
        Rhombu rhombu1 = new Rhombu(6,3);
        Rhombu rhombu2 = new Rhombu(7,4);

        System.out.println(rhombu1.getArea());
        System.out.println(rhombu1.getPerimeter());
        System.out.println(rhombu2.getPerimeter());

    }
}