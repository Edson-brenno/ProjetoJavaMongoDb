package com.spring.Controller.Exceptions;

public class FieldInvalidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String url;

    public FieldInvalidException(String fieldError, String url) {
        super("Field " + fieldError + " is invalid");
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
