package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    CalculatorImpl calculator = new CalculatorImpl();

    @Test
    public void sumElementsOfArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        int actualSum = calculator.sumElementsOfArray(customArray);
        int expected = 16;
        assertEquals(actualSum, expected);
    }

    @Test
    public void averageOfArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        double actualAverage = calculator.averageOfArray(customArray);
        double expected = 4.0;
        assertEquals(actualAverage, expected);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForSumElementsOfArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        calculator.sumElementsOfArray(customArray);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForAverageOfArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        calculator.averageOfArray(customArray);
    }

}