package com.sebastian;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc; 

    @BeforeEach
    void initializer(){
        calc = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calc = null;
    }
    @Test
    void sumTest() {
        assertEquals(5, calc.sum(2, 3));
    }

    @Test
    void substractionTest() {
        assertEquals(5, calc.substraction(10, 5));
    }

    @Test
    void multiplicationTest() {
        assertEquals(6, calc.multiplication(2, 3));
    }

    @Test
    void divisionTest() {
        assertEquals(3, calc.division(6, 2));
    }

    @Test
    @DisplayName("ExceptionChecking")
    void divisionExceptionTest() {
        Calculator calc = new Calculator();
        ArithmeticException excep = assertThrows(ArithmeticException.class, () -> {
            calc.division(4, 0);
        });

        assertTrue(excep.getMessage().equalsIgnoreCase("the divisor can't be 0"), "the error message should let the user know they can't divide by 0");
    }
}
