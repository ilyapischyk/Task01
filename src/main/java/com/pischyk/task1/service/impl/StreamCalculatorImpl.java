package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.service.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StreamCalculatorImpl implements Calculator {
    private final static Logger logger = LogManager.getLogger();

    public int sumElementsOfArray(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding sum of elements");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        int sum= Arrays.stream(customArray.getArray())
                .sum();
        return sum;
    }

    public double averageOfArray(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding average of elements");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        double average= Arrays.stream(customArray.getArray())
                .average()
                .getAsDouble();
        return average;
    }
}
