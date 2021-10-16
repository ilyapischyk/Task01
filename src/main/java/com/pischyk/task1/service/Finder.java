package com.pischyk.task1.service;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;

public interface Finder {
    int arrayMin(CustomArray customArray) throws ArrayLenghtException;
    int arrayMax(CustomArray customArray) throws ArrayLenghtException;
    int negativeNumbersInArray(CustomArray customArray) throws ArrayLenghtException;
    int positiveNumbersInArray(CustomArray customArray) throws ArrayLenghtException;
}
