package com.kiranit.mysqlConnection.customException;

public class StudentAlreadyExistException extends RuntimeException{
    public StudentAlreadyExistException(){
        super();
    }

    public StudentAlreadyExistException(String message){
        super(message);
    }
}
