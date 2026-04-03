package com.internship.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.internship.portal.entity.Task;
import com.internship.portal.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskRepository repo;


    // GET all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return repo.findAll();
    }


    // CREATE task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repo.save(task);
    }


    // UPDATE task status
    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task updatedTask) {

        Task task = repo.findById(id).orElseThrow();

        task.setStatus(updatedTask.getStatus());

        return repo.save(task);
    }

}