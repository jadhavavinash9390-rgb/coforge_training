package com.coforge.ems.exception;

public class InvalidEmployeeObjectException extends Exception {

    public InvalidEmployeeObjectException() {
        super("Invalid Employee Details");
    }

    public InvalidEmployeeObjectException(String message) {
        super(message);
    }
}