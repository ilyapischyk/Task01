package com.pischyk.task1.reader;

import com.pischyk.task1.exception.ArrayLenghtException;

import java.util.ArrayList;

public interface DataReader {
    public ArrayList<String> readFile(String path) throws ArrayLenghtException;
}
