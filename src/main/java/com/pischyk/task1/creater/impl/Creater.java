package com.pischyk.task1.creater.impl;

import com.pischyk.task1.creater.CreaterInterface;
import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Creater implements CreaterInterface {
    private static final Logger logger = LogManager.getLogger();


    public CustomArray createCustomArray(int[] someArray) throws ArrayLenghtException {
        logger.info("Creating CustomArray");
        if (someArray == null) {
            throw new ArrayLenghtException("Array must be not Null");
        } else {
            CustomArray customArray = new CustomArray();
            customArray.setArray(someArray);
            return customArray;
        }
    }
}
