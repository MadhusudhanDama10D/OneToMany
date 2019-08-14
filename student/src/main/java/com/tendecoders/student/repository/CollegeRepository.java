package com.tendecoders.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tendecoders.student.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {

}