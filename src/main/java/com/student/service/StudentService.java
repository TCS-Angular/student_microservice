package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	
	public List<Student> getStudentOfTeacher(long cId); 

}
