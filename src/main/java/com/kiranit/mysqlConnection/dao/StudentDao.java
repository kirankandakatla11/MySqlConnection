package com.kiranit.mysqlConnection.dao;

import com.kiranit.mysqlConnection.domain.Student;
import com.kiranit.mysqlConnection.entity.StudentEntity;
import com.kiranit.mysqlConnection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDao {
    @Autowired
    private StudentRepository studentRepository;

    public String saveStudents(StudentEntity studentEntity)
    {
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
}
