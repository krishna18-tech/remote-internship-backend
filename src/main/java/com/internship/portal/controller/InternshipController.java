package com.internship.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.internship.portal.entity.Internship;
import com.internship.portal.service.InternshipService;

@RestController
@RequestMapping("/internships")
@CrossOrigin
public class InternshipController {

    @Autowired
    private InternshipService service;

    // GET all internships
    @GetMapping
    public List<Internship> getAllInternships() {
        return service.getAllInternships();
    }

    // ADD internship
    @PostMapping
    public Internship addInternship(@RequestBody Internship internship) {
        return service.saveInternship(internship);
    }

    // DELETE internship
    @DeleteMapping("/{id}")
    public void deleteInternship(@PathVariable Long id) {
        service.deleteInternship(id);
    }

}