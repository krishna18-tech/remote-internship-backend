package com.internship.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.internship.portal.entity.Feedback;
import com.internship.portal.repository.FeedbackRepository;

@RestController
@RequestMapping("/feedback")
@CrossOrigin
public class FeedbackController {

    @Autowired
    private FeedbackRepository repo;

    @GetMapping
    public List<Feedback> getAllFeedback() {
        return repo.findAll();
    }

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return repo.save(feedback);
    }
}