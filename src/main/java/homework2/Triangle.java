package homework2;

public class Triangle {
    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcArea() {
        int p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b));
        System.out.println("The area of the triangle is: " + area);

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
