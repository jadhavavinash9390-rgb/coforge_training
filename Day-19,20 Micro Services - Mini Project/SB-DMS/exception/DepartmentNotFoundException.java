package com.coforge.dms.exception;

public class DepartmentNotFoundException extends Exception {

    public DepartmentNotFoundException() {
        super("Department Not Found");
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}