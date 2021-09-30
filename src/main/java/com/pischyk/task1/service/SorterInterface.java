package com.pischyk.task1.service;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;

public interface SorterInterface {
    void bubbleSort(CustomArray customArray) throws ArrayLenghtException;
    void insertionSort(CustomArray customArray) throws ArrayLenghtException;
    void shellSort(CustomArray customArray) throws ArrayLenghtException;
}
