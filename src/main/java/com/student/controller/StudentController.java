package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/teacher/{cId}")
	public List<Student> getStudents(@PathVariable("cId") Long cId ) {
		return this.studentService.getStudentOfTeacher(cId);
		
	}

}
