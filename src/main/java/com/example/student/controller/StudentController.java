package com.example.student.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam String sub) {
		String s = sub;
		Student p = studentService.create(name, s);
		return p.toString();
	}

	@RequestMapping("/getAll")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@RequestMapping ("/deleteAll")
	public String deleteAll() {
		studentService.deleteAll();
		return "Deleted all records";
	}
	@RequestMapping ("/check")
	public String check() {
		return "Student is Running";
	}

}
