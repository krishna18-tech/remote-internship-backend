package com.internship.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.portal.entity.Internship;
import com.internship.portal.repository.InternshipRepository;

@Service
public class InternshipService {

    @Autowired
    private InternshipRepository repo;

    public Internship saveInternship(Internship internship){
        return repo.save(internship);
    }

    public List<Internship> getAllInternships(){
        return repo.findAll();
    }
}