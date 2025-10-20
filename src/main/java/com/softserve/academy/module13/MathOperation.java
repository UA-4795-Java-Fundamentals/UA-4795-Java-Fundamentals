package com.softserve.academy.module13;

public interface MathOperation {
    int operation(int a, int b);

}

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();
        MathOperation add = Integer::sum;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation product = (a, b) -> {
            return a * b;
        };
        MathOperation div = (int a, int b) -> a / b;

        System.out.println(test.operate(15,10, add));
        System.out.println(test.operate(23,17,subtraction));
        System.out.println(test.operate(56,12,product));
        System.out.println(test.operate(45,5,div));


    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
