package com.softserve.academy.module8;

public class Example3 {

    static double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(x);
    }

    static void foo(double x) {
        double res;
        try {
            res = safeSqrt(x);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//            return -1;
        }
        //System.out.println("res: " + res);
    }

    public static void main(String[] args) {
        foo(-9);
    }
}
