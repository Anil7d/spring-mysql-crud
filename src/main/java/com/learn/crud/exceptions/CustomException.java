package com.learn.crud.exceptions;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Setter
@Getter
public class CustomException extends Exception{

    public CustomException(String message) {
        super(message);
    }
}
