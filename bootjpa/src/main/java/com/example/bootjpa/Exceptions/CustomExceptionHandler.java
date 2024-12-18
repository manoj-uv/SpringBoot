package com.example.bootjpa.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(AlienNotFoundException.class)
//    public final ResponseEntity<ExceptionResponse> handleAllExceptions(AlienNotFoundException ex, WebRequest request){
//        ExceptionResponse er = new ExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
//        System.out.println("Er = " +er.toString());
//        return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
//    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<String> handleAllExceptions (Exception ex, WebRequest request){
        return new ResponseEntity(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
