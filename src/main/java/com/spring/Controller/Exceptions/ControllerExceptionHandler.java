package com.spring.Controller.Exceptions;

import com.spring.Dto.ErrorDto.ErrorDetailDto;
import com.spring.Dto.ErrorDto.ErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;
import java.io.IOException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(FieldInvalidException.class)
    public ResponseEntity<ErrorResponseDto> fieldInvalidException(FieldInvalidException ex, HttpServletRequest request) throws IOException {

        ErrorDetailDto errorDetailDto = new ErrorDetailDto(ex.getMessage());
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(HttpStatus.BAD_REQUEST, errorDetailDto, ex.getUrl());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponseDto);
    }
}
