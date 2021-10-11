package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangerTest {
    Changer changer = new Changer();

    @Test
    public void changeTest() throws ArrayLenghtException, IncorrectConditionException {
        CustomArray customArray = new CustomArray(new int[]{1, 4, 5, 6});
        changer.changeElements(customArray, "<", 5, 0);
        int[] actual = customArray.getArray();
        int[] expected = new int[]{0, 0, 5, 6};
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForChangeServiceTest() throws ArrayLenghtException, IncorrectConditionException {
        CustomArray customArray = new CustomArray();
        changer.changeElements(customArray, "<", 5, 0);
    }

    @Test(expectedExceptions = IncorrectConditionException.class)
    public void nullArrayForAverageOfArrayTest() throws ArrayLenghtException, IncorrectConditionException {
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        changer.changeElements(customArray, "!", 5, 0);
    }

}