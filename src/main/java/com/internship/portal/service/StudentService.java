package com.internship.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.portal.entity.Student;
import com.internship.portal.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){
        return repo.save(student);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}