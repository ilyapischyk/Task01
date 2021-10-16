package com.pischyk.task1;

import com.pischyk.task1.creater.impl.CreaterImpl;
import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import com.pischyk.task1.parser.impl.StringParserImpl;
import com.pischyk.task1.reader.impl.DataReaderImpl;
import com.pischyk.task1.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        DataReaderImpl dataReader = new DataReaderImpl();
        StringParserImpl stringParser = new StringParserImpl();
        CreaterImpl creater = new CreaterImpl();
        CalculatorImpl calculator = new CalculatorImpl();
        ChangerImpl changer = new ChangerImpl();
        FinderImpl finder = new FinderImpl();
        SorterImpl sorter = new SorterImpl();
        StreamCalculatorImpl streamCalculator = new StreamCalculatorImpl();
        StreamChangerImpl streamChanger = new StreamChangerImpl();
        StreamFinderImpl streamFinder = new StreamFinderImpl();
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
