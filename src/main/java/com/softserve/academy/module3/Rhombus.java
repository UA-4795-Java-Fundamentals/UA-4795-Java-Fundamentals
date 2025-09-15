package com.softserve.academy.module3;

import java.util.Scanner;

//proc
public class Rhombus {
    public static double area (double side, double height){
        return side * height;
    }
    public static double perimeter(double side){
        return 4 * side;
    }
}

class DemoRhombus{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side: ");

        double side = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        System.out.println("Area " + Rhombus.area(side, height));
        System.out.println("Area " + Rhombus.perimeter(side));

        scanner.close();
        System.out.println(Rhombus.area(5, 3));
        System.out.println(Rhombus.perimeter(5));

    }
}
