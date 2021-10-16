package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.service.Finder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StreamFinderImpl implements Finder {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public int arrayMin(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding minimum of array");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        int min = Arrays.stream(customArray.getArray())
                .min()
                .getAsInt();
        return min;
    }

    @Override
    public int arrayMax(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding maximum of array");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        int max = Arrays.stream(customArray.getArray())
                .max()
                .getAsInt();
        return max;
    }

    @Override
    public int negativeNumbersInArray(CustomArray customArray) throws ArrayLenghtException {
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        logger.info("Finding count of negative numbers");
        int count = (int) Arrays.stream(customArray.getArray())
                .filter(element -> element < 0)
                .count();
        return count;
    }

    @Override
    public int positiveNumbersInArray(CustomArray customArray) throws ArrayLenghtException {
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        logger.info("Finding count of positive numbers");
        int count = (int) Arrays.stream(customArray.getArray())
                .filter(element -> element > 0)
                .count();
        return count;
    }
}
