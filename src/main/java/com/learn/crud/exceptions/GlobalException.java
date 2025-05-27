package com.learn.crud.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(CustomException.class)
        public ResponseEntity<ApiError> userExists(CustomException customException, HttpServletRequest httpServletRequest){
    
        ApiError error=new ApiError(customException.getMessage(),httpServletRequest.getRequestURI(),404,LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException methodArgumentNotValidException, HttpServletRequest httpServletRequest){
    	 Map<String,String> errorMap=new HashMap<>();
    	 methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(err->errorMap.put(err.getField(), err.getDefaultMessage()));
    	 
    	 ApiError error = new ApiError(errorMap, httpServletRequest.getRequestURI() , 410, LocalDateTime.now());
    	 
    	 return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
