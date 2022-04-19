package com.kiranit.mysqlConnection.dao;

import com.kiranit.mysqlConnection.customException.EmptyInputException;
import com.kiranit.mysqlConnection.customException.NoSuchStudentException;
import com.kiranit.mysqlConnection.customException.StudentAlreadyExistException;
import com.kiranit.mysqlConnection.entity.StudentEntity;
import com.kiranit.mysqlConnection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentDao {
    @Autowired
    private StudentRepository studentRepository;

    public String saveStudents(StudentEntity studentEntity)
    {
       if (isEmpty(studentEntity.getFirstName()))throw new EmptyInputException("invalid input");
       if (isEmpty(studentEntity.getLastName()))throw new EmptyInputException("invalid input");
       if (isEmpty(studentEntity.getAddress()))throw new EmptyInputException("invalid input");
       if (isEmpty(studentEntity.getMarks()))throw new EmptyInputException("invalid input");
       if (isEmpty(studentEntity.getBranch()))throw new EmptyInputException("invalid input");
            studentRepository.save(studentEntity);


        return " success";
    }
    public List<StudentEntity> getAllStudents()
    {
        Iterable<StudentEntity> studentList=studentRepository.findAll();
        List<StudentEntity> studentEntities=new ArrayList<>();
        studentList.forEach(studentEntity->studentEntities.add(studentEntity));
        return studentEntities;
    }
    public StudentEntity getId(Integer id) {
        Optional<StudentEntity> optionalStudentEntity = studentRepository.findById(id);
        if (!optionalStudentEntity.isPresent()){
            throw new NoSuchStudentException("No data found");
        }
        StudentEntity studentEntity = optionalStudentEntity.get();
        return studentEntity;
    }
    public String deleteStudent(Integer id){
        try {
            studentRepository.deleteById(id);
        }catch (Exception e){
            throw new NoSuchStudentException("Delete failed");
        }

        return "delete success";
    }

    private boolean isEmpty(String input){
        if(input!=null && input.isEmpty())
            return false;
        return true;

    }




}

