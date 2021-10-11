package com.pischyk.task1.parser.impl;

import com.pischyk.task1.parser.StringParserInterface;
import com.pischyk.task1.validator.impl.StringValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class StringParser implements StringParserInterface {
    private static final Logger logger = LogManager.getLogger();

    public int[] parseString(ArrayList<String> arrayList) {
        logger.info("Parsing string");
        int[] arrayInt = null;
        StringValidator stringValidator = new StringValidator();
        for (String string : arrayList) {
            if (stringValidator  .isValid(string)) {
                String[] elements = string.split(",\\s+");
                arrayInt = new int[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    arrayInt[i] = Integer.parseInt(elements[i]);
                }
                break;
            }
        }
        return arrayInt;
    }
}
