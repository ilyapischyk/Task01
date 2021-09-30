package com.pischyk.task1.validator.impl;

import com.pischyk.task1.validator.StringValidatorInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringValidator implements StringValidatorInterface {

    private static final Logger logger = LogManager.getLogger();

    public boolean isValid(String str) {
        logger.info("FileValidator called isValid");
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

