package com.internship.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.portal.entity.Task;
import com.internship.portal.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public Task saveTask(Task task){
        return repo.save(task);
    }

    public List<Task> getAllTasks(){
        return repo.findAll();
    }
}