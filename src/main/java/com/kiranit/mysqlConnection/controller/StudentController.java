package com.kiranit.mysqlConnection.controller;

import com.kiranit.mysqlConnection.domain.Student;
import com.kiranit.mysqlConnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "save")
    public ResponseEntity saveStudents(@RequestBody Student student)
    {
        studentService.saveStudents(student);
        return ResponseEntity.status(200).body("Success");
    }

    @GetMapping("getAll")
    public ResponseEntity< List<Student>> getAllStudents(){
        List<Student> studentList=studentService.getAllStudents();

        return new ResponseEntity <List<Student>>(studentList, HttpStatus.OK);
    }
    @GetMapping("get/{studentId}")
    public ResponseEntity<?> getId(@PathVariable int studentId ){
       Student studentRetrived=studentService.getId(studentId);
        return  new ResponseEntity<Student>(studentRetrived,HttpStatus.OK);
    }
    @DeleteMapping("delete/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer studentId){
        System.out.println("initiated controller: api/delete/student");
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
   

}
