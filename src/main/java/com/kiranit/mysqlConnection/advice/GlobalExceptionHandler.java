package com.kiranit.mysqlConnection.advice;

import com.kiranit.mysqlConnection.customException.EmptyInputException;
import com.kiranit.mysqlConnection.customException.NoSuchStudentException;
import com.kiranit.mysqlConnection.customException.StudentAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<String > handleEmptyInput(EmptyInputException emptyInputException){
        return new ResponseEntity<String>("Input field is empty,please look into it",HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler (NoSuchStudentException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchStudentException ex){
        return new ResponseEntity<String>("No value is present in DB, please change your request",HttpStatus.NOT_FOUND  );
    }

    @ExceptionHandler (StudentAlreadyExistException.class)
    public ResponseEntity<String> StudentAlreadyExistException(StudentAlreadyExistException ex){
        return new ResponseEntity<String>("Student is already present in DB, please change your request",HttpStatus.NOT_FOUND  );
    }


}
