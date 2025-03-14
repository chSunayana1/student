package com.example.demoForJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoForJpa.entity.student;

public interface StudentRepo  extends JpaRepository<student,Long>{

}
