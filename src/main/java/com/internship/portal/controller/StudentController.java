package com.internship.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.internship.portal.entity.Student;
import com.internship.portal.service.StudentService;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }
}