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
        assertEquals(2, calculator.subtract(8,6));
    }

    // int values 1 ,23 ,34 ,
    // float value will be 1.0 , 2.3


    @DisplayName("Test division functionality")
    @Test
    public void testDivide() {
        assertEquals(2.0,calculator.divide(4,2),0);
        assertEquals(5.0,calculator.divide(15,3),0);
    }

    @Test
    @DisplayName("Test multiplication functionality")
    public void testMultiply() {
        assertEquals(6,calculator.multiply(2,3));
        assertEquals(8,calculator.multiply(4,2));
    }

    @Test
    @DisplayName("Test square root functionality")
    public void testSquareRoot(){
        assertEquals(4,calculator.squareRootOf(16),0);
        assertNotEquals(4,calculator.squareRootOf(8),0);

    }

    //The first test case checks if the area of a circle with radius 2 is approximately equal to 12.57, with a maximum difference of 0.01.
    @Test
    @DisplayName("Test area calculation functionality")
    public void testGetArea() {
       assertEquals(12.57,calculator.getArea(2),0.1);
        assertEquals(0.0, calculator.getArea(0), 0);
    }

    @Test
    @DisplayName("Test circumference calculation functionality")
    public void testGetCircumference(){

        assertEquals(12.57,calculator.getArea(2),0.1);
        assertEquals(0.0, calculator.getCircumference(0), 0);

    }

    @Test
    @DisplayName("Test testGetAreaWithNegativeNum calculation functionality")
    public void testGetAreaWithNegativeNum(){
        //double result = calculator.getArea(-5);: This line calls the getArea() method of the Calculator object with a negative input (-5) and stores the result in the result variable.
       double result = calculator.getArea(-5);
       //assertTrue(Double.isNaN(result));: This line uses the assertTrue() method from the JUnit library to assert
        // that the result of calling getArea() with a negative input is NaN.
        // The Double.isNaN() method is used to check whether the result variable contains NaN.
       assertTrue(Double.isNaN(result));

    }

    @Test
    @DisplayName("Test testAdditionWithNegativeNum calculation functionality")
    public  void testAdditionWithNegativeNum(){

        int result = calculator.add(-2, -3); // -2 and -3 it will be -5
        // result = -5
        assertEquals(-5, result);
    }


}
