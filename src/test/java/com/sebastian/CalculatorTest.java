package com.sebastian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void sumTest() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    void substractionTest() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.substraction(10, 5));
    }

    @Test
    void multiplicationTest() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    void divisionTest() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.division(6, 2));
    }

    @Test
    void divisionExceptionTest() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calc.division(4, 0);
        });
    }
}
