package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterImpl implements com.pischyk.task1.service.Sorter {
    final static Logger logger = LogManager.getLogger();

    public void bubbleSort(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Bubble method sorting");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array  is null");
        }
        int temp;
        int[] tempArray = customArray.getArray();
        for (int i = 1; i < tempArray.length; i++){
            for (int j = tempArray.length - 1; j >= i; j--){
                if (tempArray[j - 1] > tempArray[j]){
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        customArray.setArray(tempArray);
    }

    public void insertionSort(CustomArray customArray) throws ArrayLenghtException {
        logger.info("insertion method sorting");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array  is null");
        }
        int temp;
        int[] tempArray = customArray.getArray();
        for (int i = 1; i <  tempArray.length; i++){
            for (int j = i; j >= 1; j--){
                if (tempArray[j] < tempArray[j - 1]){
                    temp = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = temp;
                } else {
                    break;
                }
            }
        }
        customArray.setArray(tempArray);
    }

    public void shellSort(CustomArray customArray) throws ArrayLenghtException {
        logger.info("Shell method sorting");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array  is null");
        }
        if (customArray.getArray().length < 2) {
            return;
        }
        int[] tempArray = customArray.getArray();
        int step = tempArray.length / 2;
        while (step > 0) {
            for (int i = step; i < tempArray.length; i++) {
                int current = tempArray[i];
                int j = i - step;
                while ((j >= 0 && current < tempArray[j])) {
                    tempArray[j + step] = tempArray[j];
                    j -= step;
                }
                tempArray[j + step] = current;
            }
            step /= 2;
        }
        customArray.setArray(tempArray);
    }
}
