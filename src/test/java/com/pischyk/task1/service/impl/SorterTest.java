package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SorterTest {
    SorterImpl sorter = new SorterImpl();
    private final int[] expectedArray = {-5, 0, 1, 2, 3, 6};

    @Test
    public void bubbleSortTest() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        sorter.bubbleSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test
    public void insertionSortTest() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        sorter.insertionSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test
    public void shellSortTest() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray(new int[]{3, 2, 6, 1, -5, 0});
        sorter.shellSort(arrayForSort);
        int[] actual = arrayForSort.getArray();
        assertEquals(actual, expectedArray);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForShellSortTest() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray();
        sorter.shellSort(arrayForSort);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForBubbleSortTest() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray();
        sorter.bubbleSort(arrayForSort);
    }

    @Test(expectedExceptions = ArrayLenghtException.class)
    public void nullArrayForInsertionSort() throws ArrayLenghtException {
        CustomArray arrayForSort = new CustomArray();
        sorter.insertionSort(arrayForSort);
    }

}