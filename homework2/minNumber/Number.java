package minNumber;

public class Number {
     int number1 = 0;
     int number2 = 0;
     int number3 = 0;

     public Number() {
     }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
         this.number2 = number2;
    }
    public void setNumber3(int number3) {
         this.number3 = number3;
    }

    public int getNumber1() {
         return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
         return number3;
    }

    public void getMinNumber(int number1, int number2, int number3) {
        System.out.println( "Min number: " + Math.min(Math.min(number1 , number2), number3));
    }
}