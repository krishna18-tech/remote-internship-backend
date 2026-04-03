package com.internship.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.portal.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}