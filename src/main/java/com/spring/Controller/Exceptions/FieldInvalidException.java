package com.spring.Controller.Exceptions;

public class FieldInvalidException extends Exception {
    private static final long serialVersionUID = 1L;

    public FieldInvalidException(String fieldError) {
        super("Field " + fieldError + " is invalid");
    }
}
