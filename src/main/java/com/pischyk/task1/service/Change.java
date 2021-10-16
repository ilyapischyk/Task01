package com.pischyk.task1.service;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;
import com.pischyk.task1.exception.IncorrectConditionException;

public interface Change {

    void changeElements(CustomArray customArray, String condition, int whatChange, int ch) throws ArrayLenghtException, IncorrectConditionException;
}

