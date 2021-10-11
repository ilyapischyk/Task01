package com.pischyk.task1;

import com.pischyk.task1.creater.impl.Creater;
import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import com.pischyk.task1.parser.impl.StringParser;
import com.pischyk.task1.reader.impl.DataReader;
import com.pischyk.task1.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        StringParser stringParser = new StringParser();
        Creater creater = new Creater();
        Calculator calculator = new Calculator();
        Changer changer = new Changer();
        Finder finder = new Finder();
        Sorter sorter = new Sorter();
        StreamCalculator streamCalculator = new StreamCalculator();
        StreamChanger streamChanger = new StreamChanger();
        StreamFinder streamFinder = new StreamFinder();
        CustomArray customArray = new CustomArray();

        try {
            customArray = creater.createCustomArray(stringParser.parseString
                    (dataReader.readFile("./src/main/resources/datafile/data.txt")));

            System.out.println(customArray.toString());
            changer.changeElements(customArray, ">", 3, 4);
            System.out.println(customArray.toString());

            System.out.println(calculator.sumElementsOfArray(customArray));
            System.out.println(calculator.averageOfArray(customArray));
            System.out.println(finder.positiveNumbersInArray(customArray));
            System.out.println(finder.negativeNumbersInArray(customArray));
            System.out.println(finder.arrayMax(customArray));
            System.out.println(finder.arrayMin(customArray));

            System.out.println(customArray.toString());
            sorter.bubbleSort(customArray);
            System.out.println(customArray.toString());



        } catch (ArrayLenghtException | IncorrectConditionException e) {
            logger.error(e);
        }


    }
}
