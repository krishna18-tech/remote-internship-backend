package com.internship.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.portal.entity.Application;
import com.internship.portal.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repo;

    public Application saveApplication(Application app){
        return repo.save(app);
    }

    public List<Application> getAllApplications(){
        return repo.findAll();
    }
}