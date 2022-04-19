package com.kiranit.mysqlConnection.customException;

public class EmptyInputException extends RuntimeException{
    public EmptyInputException(){
        super();
    }

    public EmptyInputException(String message){
        super(message);
    }
}
