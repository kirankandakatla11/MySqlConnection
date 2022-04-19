package com.kiranit.mysqlConnection.customException;

public class NoSuchStudentException  extends RuntimeException{
    public NoSuchStudentException(){
        super();
    }

    public NoSuchStudentException(String message){
        super(message);
    }
}

