package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorImpl implements com.pischyk.task1.service.Calculator {
    final static Logger logger = LogManager.getLogger();

    public int sumElementsOfArray(CustomArray customArray)throws ArrayLenghtException{
        logger.info("Finding sum of elements");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum +=tempArray[i];
        }
        return sum;
    }

    public double averageOfArray(CustomArray customArray)throws ArrayLenghtException{
        logger.info("Finding average of elements");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        return sumElementsOfArray(customArray) / tempArray.length;
    }
}
