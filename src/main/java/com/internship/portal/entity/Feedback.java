package com.internship.portal.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String internName;
    private String rating;
    private String comment;

    public Long getId() {
        return id;
    }

    public String getInternName() {
        return internName;
    }

    public String getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}