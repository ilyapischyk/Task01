package com.pischyk.task1.creater;

import com.pischyk.task1.entity.CustomArray;
import com.pischyk.task1.exception.ArrayLenghtException;

public interface Creater {
    public CustomArray createCustomArray(int[] someArray) throws ArrayLenghtException;
}
