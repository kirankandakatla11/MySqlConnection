package com.kiranit.mysqlConnection.service;

import com.kiranit.mysqlConnection.domain.Student;

import java.util.List;

public interface StudentService {
    public String saveStudents(Student student);
    public List<Student> getAllStudents();
}
