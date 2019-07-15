package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	//Create operation
	public Student create(String name, String subject) {
		return studentRepository.save(new Student(name, subject));
	}
	//Retrieve operation
	public List<Student> getAll(){
		return studentRepository.findAll();
	}

	//Delete operation
	public void deleteAll() {
		studentRepository.deleteAll();
	}
}
