package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import com.pischyk.task1.service.ChangeInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Changer implements ChangeInterface {
    final static Logger logger = LogManager.getLogger();

    public void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ArrayLenghtException, IncorrectConditionException {
        logger.info("Changing numbers");
        if (customArray.isEmpty()){
            throw new ArrayLenghtException("Array is null");
        }
        int[] tempArray = customArray.getArray();
        switch (condition) {
            case ("<"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] < whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] > whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] == whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case (">="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] >= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("<="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] <= whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case ("!="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] != whatChange) {
                        tempArray[i] = ch;
                    }
                }
                customArray.setArray(tempArray);
                break;
            default:
                logger.error("Incorrect condition");
                throw new IncorrectConditionException();
        }
    }
}
