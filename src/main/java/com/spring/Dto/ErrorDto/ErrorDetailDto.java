package com.spring.Dto.ErrorDto;

import java.io.Serializable;

public class ErrorDetailDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;

    public ErrorDetailDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}