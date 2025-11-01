package com.softserve.academy.homework12;

import java.util.List;

public class SumOfSquares {
    public static int calculate(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        return numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
    }
}
