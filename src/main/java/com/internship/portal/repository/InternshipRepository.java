package com.internship.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.portal.entity.Internship;

public interface InternshipRepository extends JpaRepository<Internship, Long> {

}