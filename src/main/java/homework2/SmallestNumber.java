package homework2;

public class SmallestNumber {
    private int a;
    private int b;
    private int c;


    public SmallestNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findSmallestNumber() {
        int firstMin = Math.min(a, b);
        int minimum = Math.min(firstMin, c);
        System.out.println("The smallest number is " + minimum);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
