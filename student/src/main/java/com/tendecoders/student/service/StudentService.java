	package com.tendecoders.student.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tendecoders.student.model.College;
import com.tendecoders.student.model.Student;
import com.tendecoders.student.repository.CollegeRepository;
import com.tendecoders.student.repository.StudentRepository;

@Component
public class StudentService {
	@Autowired
	StudentRepository repository;
	@Autowired
	CollegeRepository repo;
	
	public Student insert(Student student)
	{
		return repository.save(student);
	}
	
	public ArrayList<Student> getAll()
	{
		return  (ArrayList<Student>) repository.findAll();
	}
	public College newInsert(College college)
	{
		return repo.save(college);
	}
	public ArrayList<College> newGetAll()
	{
		return (ArrayList<College>)repo.findAll();
	}

}
