package com.pischyk.task1.validator.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidatorImpl implements com.pischyk.task1.validator.StringValidator {

    private static final Logger logger = LogManager.getLogger();

    public boolean isValid(String str) {
        logger.info("Validating string");
        if (str.length() == 0) {
            return false;
        }
        boolean flag = false;
        if(str.matches("(-?\\d+[,]?\\s+?)*")){
            String[] elements = str.split(",\\s+");
            flag=true;
            for (String element : elements) {
                if (!element.matches("-?\\d+")) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

