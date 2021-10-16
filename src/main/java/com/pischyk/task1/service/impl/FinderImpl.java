package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FinderImpl implements com.pischyk.task1.service.Finder {
    final static Logger logger = LogManager.getLogger();

    public int arrayMin(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding minimum of array");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int min = tempArray[0];
        for (int i = 1; i < tempArray.length; i++){
            if (tempArray[i] < min){
            min = tempArray[i];
            }
        }
        return min;
    }

    public int arrayMax(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding maximum of array");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int max = tempArray[0];
        for (int i = 1; i < tempArray.length; i++){
            if (tempArray[i] > max){
                max = tempArray[i];
            }
        }
        return max;
    }

    public int negativeNumbersInArray(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding count of negative numbers");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i] < 0){
                count++;
            }
        }
        return count;
    }

    public int positiveNumbersInArray(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Finding count of positive numbers");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        int count = 0;
        for (int i = 0; i < tempArray.length; i++){
            if (tempArray[i] > 0){
                count++;
            }
        }
        return count;
    }
}
