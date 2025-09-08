package triandleCalculate;

public class Data {
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;


    public void setSide1(double side1) {
        if (side1 >= 0) {
            this.side1 = side1;
        } else {
            System.out.println("Side must be positive!");
        }

    }

    public void setSide2(double side2) {
        if (side2 >= 0) {
            this.side2 = side2;
        } else {
            System.out.println("Side must be positive!");
        }
    }

    public void setSide3(double side3) {
        if (side3 >= 0) {
            this.side3 = side3;
        } else {
            System.out.println("Side must be positive!");
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    public double getArea(double side1, double side2, double side3) {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        if (area > 0) {
            return area;
        } else {
            System.out.print("Area is negative! ");
            return 0;
        }
    }
}
