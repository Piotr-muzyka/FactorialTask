package FactorialExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    // FactorialClass test

    // assert statements // Boundary Value Analysis
    @Test
    public void factorialOfZeroShouldReturnOne() {
        assertEquals("0! must be 1", 1, FactorialCalculation.Factorial(0));
    }

    @Test
    public void factorialOfFourteenShouldReturn87178291200() {
        assertEquals("14! must be 87178291200", 87178291200L, FactorialCalculation.Factorial(14));
    }

}
