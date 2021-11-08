package com.dinesh.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.model.Student;
import com.dinesh.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student)
	{
		System.out.println("SecondName");
		System.out.println("FirstName: "+student.getFirstName());
		return studentRepository.save(student);
		
	}

}
