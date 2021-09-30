package com.pischyk.task1;

import com.pischyk.task1.creater.impl.Creater;
import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;
import com.pischyk.task1.parser.impl.StringParser;
import com.pischyk.task1.reader.impl.DataReader;
import com.pischyk.task1.service.impl.Calculator;
import com.pischyk.task1.service.impl.Changer;
import com.pischyk.task1.service.impl.Finder;
import com.pischyk.task1.service.impl.Sorter;

public class Main {

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        Creater creater = new Creater();
        CustomArray customArray = new CustomArray();
        StringParser stringParser = new StringParser();
        Calculator calculator = new Calculator();
        Changer changer = new Changer();
        Finder finder = new Finder();
        Sorter sorter = new Sorter();

        try {
            customArray = creater.createCustomArray(stringParser.parseString
                    (dataReader.readFile("./src/main/resources/datafile/data.txt")));
            System.out.println(calculator.sumElementsOfArray(customArray));
            System.out.println(calculator.averageOfArray(customArray));
            System.out.println(finder.arrayMax(customArray));
            System.out.println(finder.arrayMin(customArray));
            System.out.println(finder.negativeNumbersInArray(customArray));
            System.out.println(finder.positiveNumbersInArray(customArray));
            sorter.insertionSort(customArray);
            sorter.shellSort(customArray);
            sorter.bubbleSort(customArray);
        } catch (ArrayLenghtException e) {
            e.printStackTrace();
        }
/*
        try {
            changer.changeElements(customArray, "<", 10, 19);
        } catch (IncorrectConditionException | ArrayLenghtException e) {
            e.printStackTrace();
       }
*/    }
}
