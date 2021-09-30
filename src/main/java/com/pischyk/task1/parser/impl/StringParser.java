package com.pischyk.task1.parser.impl;

import com.pischyk.task1.parser.StringParserInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class StringParser implements StringParserInterface {
    private static final Logger logger = LogManager.getLogger();

    public int[] parseString(ArrayList<String> arrayList) {
        logger.info("Parsing string");
        int[] arrayInt = null;
        for (String string : arrayList) {
            String[] elements = string.split(",\\s+");
            arrayInt = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                arrayInt[i] = Integer.parseInt(elements[i]);
            }
        }
        return arrayInt;
    }
}
