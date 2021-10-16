package com.pischyk.task1.service;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;

public interface Calculator {
    int sumElementsOfArray(CustomArray customArray)throws ArrayLenghtException;
    double averageOfArray(CustomArray customArray)throws ArrayLenghtException;
}
