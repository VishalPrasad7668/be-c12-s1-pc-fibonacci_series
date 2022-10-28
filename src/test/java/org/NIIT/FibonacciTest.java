package org.NIIT;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FibonacciTest {

    Fibonacci fibonacci = null;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }

    @Test
    public void testFibonacci() {
        assertEquals(144, fibonacci.getFibonacci(12));
        assertNotEquals(59, fibonacci.getFibonacci(10));
    }
}