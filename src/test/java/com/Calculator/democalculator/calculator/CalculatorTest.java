package com.Calculator.democalculator.calculator;

import com.Calculator.democalculator.Calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {


    public Calculator calculator = new Calculator();

    @DisplayName("Test Addition functionality")
    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));

        assertEquals(5, calculator.add(2, 3));
    }

    @DisplayName("Test subtraction  functionality")
    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(2, calculator.subtract(8, 6));
    }


    @DisplayName("Test division functionality")
    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2), 0);
        assertEquals(5.0, calculator.divide(15, 3), 0);
    }

    @Test
    @DisplayName("Test multiplication functionality")
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    @DisplayName("Test square root functionality")
    public void testSquareRoot() {
        assertEquals(4, calculator.squareRootOf(16), 0);
        assertNotEquals(4, calculator.squareRootOf(8), 0);

    }

    @Test
    @DisplayName("Test area calculation functionality")
    public void testGetArea() {
        assertEquals(12.57, calculator.getArea(2), 0.1);
        assertEquals(0.0, calculator.getArea(0), 0);
    }

    @Test
    @DisplayName("Test circumference calculation functionality")
    public void testGetCircumference() {

        assertEquals(12.57, calculator.getArea(2), 0.1);
        assertEquals(0.0, calculator.getCircumference(0), 0);

    }

    @Test
    @DisplayName("Test testGetAreaWithNegativeNum calculation functionality")
    public void testGetAreaWithNegativeNum() {
        double result = calculator.getArea(-5);
        assertTrue(Double.isNaN(result));

    }

    @Test
    @DisplayName("Test testAdditionWithNegativeNum calculation functionality")
    public void testAdditionWithNegativeNum() {

        int result = calculator.add(-2, -3);
        assertEquals(-5, result);
    }


}
