package ex2hw8;

import lombok.ToString;

public class MainNumber {
    public static void main(String[] args) {
        ReadNum num1 = new ReadNum();
        ReadNum num2 = new ReadNum();
        ReadNum num3 = new ReadNum();
        ReadNum num4 = new ReadNum();
        ReadNum num5 = new ReadNum();
        ReadNum num6 = new ReadNum();
        ReadNum num7 = new ReadNum();
        ReadNum num8 = new ReadNum();
        ReadNum num9 = new ReadNum();
        ReadNum num10 = new ReadNum();
        ReadNum[] numbers = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        ReadNum[] num = new ReadNum[10];
        for (ReadNum number : numbers) {
            number.inPutNumber();
        }


        try {
        for (int i = 0, j=0; i < numbers.length && j < numbers.length; i++, j++) {
            if (numbers[i].readNumber() != 0) {
                num[j] = numbers[i];
                System.out.println(num[j].toString() + " входит в диапазон");
            }
        }
        } catch (ArithmeticException e) {
            System.err.println("Wrong number");
        }
    }
}



