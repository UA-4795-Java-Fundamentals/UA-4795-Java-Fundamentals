package com.softserve.academy.homework11;

import java.util.function.Function;

public class DiscountCalculator {
    public static final Function<Double, Double> APPLY_10_PERCENT = price -> {
        if (price == null || price < 0) {
            throw new IllegalArgumentException("Bad price");
        }
        return price * 0.9;
    };

    public static double apply(double price) {
        return APPLY_10_PERCENT.apply(price);
    }

    public static void main(String[] args) {
        System.out.println(apply(200.0));
        // System.out.println(apply(-50.0));
        // System.out.println(apply(null));
    }
}
