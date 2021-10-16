package com.pischyk.task1.parser.impl;

import com.pischyk.task1.validator.impl.StringValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class StringParserImpl implements com.pischyk.task1.parser.StringParser {
    private static final Logger logger = LogManager.getLogger();
    final static String REGEX = ",\\s+";

    public int[] parseString(ArrayList<String> arrayList) {
        logger.info("Parsing string");
        int[] arrayInt = null;
        StringValidatorImpl stringValidator = new StringValidatorImpl();
        for (String string : arrayList) {
            if (stringValidator.isValid(string)) {
                String[] elements = string.split(REGEX);
                arrayInt = new int[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    arrayInt[i] = Integer.parseInt(elements[i]);
                }
            }
        }
        return arrayInt;
    }
}
