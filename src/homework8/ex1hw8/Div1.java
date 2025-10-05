package ex1hw8;

public class Div1 {
    private double a;
    private double b;
    public Div1(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getResult() throws ArithmeticException {
        return a / b;
    }
}
