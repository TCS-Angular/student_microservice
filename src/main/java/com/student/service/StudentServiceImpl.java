package com.student.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	// fake student list
	
	List<Student> list = List.of(
			new Student(1L,"nishant@gmail.com","Nishant", 1311L),
			new Student(2L,"Vijay@gmail.com","Vijay", 1311L),
			new Student(3L,"Rakesh@gmail.com","Rakesh", 1312L),
			new Student(4L,"Rohan@gmail.com","Rohan", 1312L),
			new Student(5L,"Surbhi@gmail.com","Surbhi", 1312L),
			new Student(6L,"Shivam@gmail.com","Shivam", 1313L),
			new Student(7L,"Rohit@gmail.com","Rohit", 1313L),
			new Student(8L,"Sourav@gmail.com","Sourav", 1314L),
			new Student(9L,"KEhsav@gmail.com","Keshav", 1314L),
			new Student(10L,"Vikas@gmail.com","Vikas", 1315L),
			new Student(11L,"Abhishek@gmail.com","Abhishek", 1315L),
			new Student(12L,"Subham@gmail.com","Subham", 1313L)
			
			);

	@Override
	public List<Student> getStudentOfTeacher(long cId) {
		// TODO Auto-generated method stub
		return list.stream().filter(student -> student.getcId().equals(cId)).collect(Collectors.toList()); 
	}

}
