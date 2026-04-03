package com.internship.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.portal.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}