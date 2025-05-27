package com.learn.crud.exceptions;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;


@Getter
@Setter
@Data
public class ApiError {
    private String message;
    private Integer statusCode;
    private LocalDateTime timeStamp;
    private String path;

    public ApiError(String message, String path, Integer statusCode, LocalDateTime timeStamp) {
        this.message = message;
        this.path = path;
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
    }
}
