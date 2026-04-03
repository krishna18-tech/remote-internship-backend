package com.internship.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.portal.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}