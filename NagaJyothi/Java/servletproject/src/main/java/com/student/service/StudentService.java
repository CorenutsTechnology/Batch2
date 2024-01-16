package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService 
{
	void save(Student student);
	 void delete(int id);
	  void update(Student student);
	  List<Student> fetchAll();
	  List<Student> fetch(int id);
	 

}
