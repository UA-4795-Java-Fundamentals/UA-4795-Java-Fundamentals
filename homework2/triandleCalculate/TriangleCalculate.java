package triandleCalculate;

import java.util.Scanner;

public class TriangleCalculate {
    public static void main(String[] args) {
        Data side = new Data();
        Data area = new Data();

        System.out.print("Enter the side1: ");
        side.setSide1(new Scanner(System.in).nextFloat());
        System.out.print("\nEnter the side2: ");
        side.setSide2(new Scanner(System.in).nextFloat());
        System.out.print("\nEnter the side3: ");
        side.setSide3(new Scanner(System.in).nextFloat());
        System.out.println("\nArea: " + area.getArea(side.getSide1(), side.getSide2(), side.getSide3()));
    }
}