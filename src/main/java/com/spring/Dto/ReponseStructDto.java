package com.spring.Dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public class ReponseStructDto <T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private int statusCode;
    private T data;
    private String message;
    private String url;

    public ReponseStructDto(){}

    public ReponseStructDto(HttpStatus status, T data, String message, String url ){
        this.status = status;
        this.statusCode = status.value();
        this.data = data;
        this.message = message;
        this.url = url;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
