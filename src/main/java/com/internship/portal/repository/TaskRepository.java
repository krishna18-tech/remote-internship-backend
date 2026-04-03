package com.internship.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.portal.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}