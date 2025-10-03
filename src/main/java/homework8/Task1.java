package homework8;

public class Task1 {

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        try{
            System.out.println("Result: " + div(0, 0));
        } catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
