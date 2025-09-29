package com.softserve.academy.module6.calc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();

    @BeforeEach
    void setUp() {
        out.println("Start");
    }

    @AfterEach
    void tearDown() {
        out.println("The End");
    }

    @Test
    void testSumTwoPositiveNumbers() {
        assertEquals(5, calc.add(2, 3),"Addition of positive numbers failed");
    }

    @Test
    void testSumTwoNegativeNumbers() {
        assertEquals(-5, calc.add(-2, -3),"Addition of negative numbers failed");
    }

    @Test
    void testSumPositiveAndNegativeNumbers() {
        int actual = calc.add(15, -5);
        int expected = 10;
        assertEquals(expected, actual, "Addition of positive and negative numbers failed");

    }
    @Test
    void testDivTwoNegativeNumbers() {
        assertEquals(2, calc.div(-10, -5),"Div of negative numbers failed");
    }

    @Test
    void testDivException() {
        assertThrows(ArithmeticException.class, () -> {
            calc.div(5, 0);
        });
    }
}