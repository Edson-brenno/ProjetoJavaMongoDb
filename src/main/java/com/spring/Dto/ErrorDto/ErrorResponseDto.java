package com.spring.Dto.ErrorDto;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ErrorResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private int code;
    private ErrorDetailDto error;
    private String url;

    public ErrorResponseDto(HttpStatus status, ErrorDetailDto errorDetail, String url) {
        this.status = status;
        this.code = status.value();
        this.error = errorDetail;
        this.url = url;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ErrorDetailDto getError() {
        return error;
    }

    public void setError(ErrorDetailDto error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
