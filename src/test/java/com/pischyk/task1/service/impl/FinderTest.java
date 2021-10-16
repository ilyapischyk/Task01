package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FinderTest {
    FinderImpl finder = new FinderImpl();

    @Test
    public void minArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{2, 3, 6, 0, -1});
        int actual = finder.arrayMin(customArray);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    public void maxArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{2, 3, 6, 0, -1});
        int actual = finder.arrayMax(customArray);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void negativeNumbersInArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{2, -3, 6, 0, -1});
        int actual = finder.negativeNumbersInArray(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void positiveNumbersInArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray(new int[]{2, -3, 6, 0, -1});
        int actual = finder.negativeNumbersInArray(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForMinArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        finder.arrayMin(customArray);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForMaxArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        finder.arrayMax(customArray);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForNegativeNumbersInArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        finder.negativeNumbersInArray(customArray);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForPositiveNumbersInArrayTest() throws ArrayLenghtException {
        CustomArray customArray = new CustomArray();
        finder.positiveNumbersInArray(customArray);
    }

}