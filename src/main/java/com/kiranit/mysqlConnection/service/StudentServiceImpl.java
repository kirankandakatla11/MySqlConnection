package com.kiranit.mysqlConnection.service;

import com.kiranit.mysqlConnection.dao.StudentDao;
import com.kiranit.mysqlConnection.domain.Student;
import com.kiranit.mysqlConnection.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    public String saveStudents(Student student)
    {
        StudentEntity studentEntity=new StudentEntity();
        studentEntity.setId(student.getId());
        studentEntity.setFirstName(student.getFirstName());
        studentEntity.setLastName(student.getLastName());
        studentEntity.setMarks(student.getMarks());
        studentEntity.setBranch(student.getBranch());
        studentEntity.setAddress(student.getAddress());
        studentDao.saveStudents(studentEntity);

        return "success";
    }

    public List<Student> getAllStudents(){
        List<Student> studentList=new ArrayList<>();
        List<StudentEntity> studentEntities=studentDao.getAllStudents();
        for(StudentEntity studentEntity:studentEntities){
            Student student=new Student();
            student.setId(studentEntity.getId());
            student.setFirstName(studentEntity.getFirstName());
            student.setLastName(studentEntity.getLastName());
            student.setMarks(studentEntity.getMarks());
            student.setBranch(studentEntity.getBranch());
            student.setAddress(studentEntity.getAddress());
            studentList.add(student);
        }
        return studentList;
    }
    public Student getId(Integer id){
        Student student=new Student();
        StudentEntity studentEntity= studentDao.getId(id);
        student.setId(studentEntity.getId());
        student.setFirstName(studentEntity.getFirstName());
        student.setLastName(studentEntity.getLastName());
        student.setMarks(studentEntity.getMarks());
        student.setBranch(studentEntity.getBranch());
        student.setAddress(studentEntity.getAddress());

        return student;
    }
    public String deleteStudent(Integer id){
        studentDao.deleteStudent(id);
        return "delete success";

    }
}
