package homework2.run;

import homework2.Triangle;

public class RunTriangle {
    public static void main(String[] args) {

        Triangle tr = new Triangle(3, 5, 8);
        System.out.println("Input side 1: " + tr.getA());
        System.out.println("Input side 2: " + tr.getB());
        System.out.println("Input side 3: " + tr.getC());
        tr.calcArea();

    }
}
