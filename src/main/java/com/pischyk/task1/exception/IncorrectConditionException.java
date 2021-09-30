package com.pischyk.task1.exception;

public class IncorrectConditionException extends Exception {
    private  String message;
    public  IncorrectConditionException(){
        message= "Incorrect condition";
    }

    public String getMassage() {
        return message;
    }
}
