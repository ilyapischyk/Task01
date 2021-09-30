package com.pischyk.task1.entity;

import com.pischyk.task1.exception.ArrayLenghtException;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray(){
    }

    public CustomArray(int... array) throws ArrayLenghtException {
        if (array.length < 1) throw new ArrayLenghtException("Array  must be 1 or more.");
        this.array = array;
    }

    public int[] getArray() {
        int[] cloneArray = Arrays.copyOf(array, array.length);
        return cloneArray;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public boolean isEmpty() {
        if (array == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (array == null) {
            return " CustomArray null";
        }
        StringBuilder sb = new StringBuilder();
        for (int a : array
        ) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CustomArray customArray = (CustomArray) obj;
        if (array.length != customArray.array.length) {
            return false;
        }
        if (this.hashCode() != customArray.hashCode()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        for (int i = 0; i < array.length; i++) {
            hashCode = 31 * hashCode + array[i] * 2 ^ i;
        }
        return hashCode;
    }
}
