package minNumber;

import java.util.Random;

public class MinNumber {
    public static void main(String[] args) {
        Number number = new Number();

        number.setNumber1(new Random().nextInt(100));
        number.setNumber2(new Random().nextInt(100));
        number.setNumber3(new Random().nextInt(100));
        System.out.println(number.getNumber1() + " " + number.getNumber2() + " " + number.getNumber3());
        number.getMinNumber(number.getNumber1(), number.getNumber2(), number.getNumber3());
    }
}
