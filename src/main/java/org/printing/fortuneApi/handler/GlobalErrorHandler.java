package org.printing.fortuneApi.handler;

import org.printing.fortuneApi.Model.CustomErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex,WebRequest request){
        CustomErrorMessage message=new CustomErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR,ex);

        return new ResponseEntity<>(message,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

