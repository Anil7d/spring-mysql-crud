package com.learn.crud.exceptions;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;


@Getter
@Setter
@Data
@NoArgsConstructor
public class ApiError {
    private String message;
    private Integer statusCode;
    private LocalDateTime timeStamp;
    private String path;
    private Map<String,String> errors;

    public ApiError(String message, String path, Integer statusCode, LocalDateTime timeStamp) {
        this.message = message;
        this.path = path;
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
    }

	@Override
	public String toString() {
		return "ApiError [message=" + message + ", statusCode=" + statusCode + ", timeStamp=" + timeStamp + ", path="
				+ path + "]";
	}
	
    public ApiError(Map<String,String> errors, String path, int statusCode, LocalDateTime timeStamp) {
        this.errors = errors;
       
        this.path = path;
        this.statusCode = statusCode;
        this.timeStamp = timeStamp;
    }
    
}
