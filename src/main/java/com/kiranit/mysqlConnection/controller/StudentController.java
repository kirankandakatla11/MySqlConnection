package com.kiranit.mysqlConnection.controller;

import com.kiranit.mysqlConnection.domain.Student;
import com.kiranit.mysqlConnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("save")
    public String saveStudents(@RequestBody Student student)
    {
        studentService.saveStudents(student);
        return "success";
    }
    @GetMapping("getAll")
    public List<Student> getAllStudents(){
        List<Student> studentList=studentService.getAllStudents();

        return studentList;
    }

}
