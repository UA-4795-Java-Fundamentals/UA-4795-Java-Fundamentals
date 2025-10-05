package ex1hw8;

public class DivMain {
    public static void main(String[] args) {
        Div1 div1 = new Div1(0, 6);
        double result = div1.getResult();
       if (Double.isNaN(result)) {
           System.out.println("A = 0, B = 0");
       } else if (Double.isInfinite(result)) {
           System.out.println("B = 0!!!");
       } else if (result == 0.0){
           System.out.println("A = 0!!!!");
       }
       else {
           System.out.println("result is " + result);
       }
    }
}
