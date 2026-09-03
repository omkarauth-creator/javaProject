package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(30, App.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, App.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(200, App.multiply(10, 20));
    }

    @Test
    void testDivision() {
        assertEquals(5, App.divide(10, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> App.divide(10, 0)
        );
    }
}
