package com.internship.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.internship.portal.entity.Application;
import com.internship.portal.service.ApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @PostMapping
    public Application applyInternship(@RequestBody Application app){
        return service.saveApplication(app);
    }

    @GetMapping
    public List<Application> getApplications(){
        return service.getAllApplications();
    }
}