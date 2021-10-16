package com.pischyk.task1.service.impl;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import com.pischyk.task1.service.Change;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class StreamChangerImpl implements Change {
    private final static Logger logger = LogManager.getLogger();
    private String[] arrayOfCondition = new String[]{">", "<", "=", "!=", "<=", ">="};

    @Override
    public void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ArrayLenghtException, IncorrectConditionException {
        logger.info("Changing numbers");
        if (customArray.isEmpty()) {
            throw new ArrayLenghtException("Array is null");
        }
        boolean isCorrectCondition = Arrays.stream(arrayOfCondition)
                .noneMatch(x -> x == condition);
        if (isCorrectCondition) {
            throw new IncorrectConditionException();
        }
        int[] tempArray = customArray.getArray();
        int[] newArray = Arrays.stream(tempArray)
                .map(x -> {
                    switch (condition) {
                        case ("<"):
                            if (x < whatChange) {
                                x = ch;
                            }
                            break;
                        case (">"):
                            if (x > whatChange) {
                                x = ch;
                            }
                            break;
                        case ("="):
                            if (x == whatChange) {
                                x = ch;
                            }
                            break;
                        case (">="):
                            if (x >= whatChange) {
                                x = ch;
                            }
                            break;
                        case ("<="):
                            if (x <= whatChange) {
                                x = ch;
                            }
                            break;
                        case ("!="):
                            if (x != whatChange) {
                                x = ch;
                            }
                            break;
                    }
                    return x;
                })
                .toArray();

        customArray.setArray(newArray);
    }
}
