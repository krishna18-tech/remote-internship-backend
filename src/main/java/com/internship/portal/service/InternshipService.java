package com.internship.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.portal.entity.Internship;
import com.internship.portal.repository.InternshipRepository;

@Service
public class InternshipService {

    @Autowired
    private InternshipRepository repository;

    public List<Internship> getAllInternships(){
        return repository.findAll();
    }

    public Internship saveInternship(Internship internship){
        return repository.save(internship);
    }

    public void deleteInternship(Long id){
        repository.deleteById(id);
    }

}