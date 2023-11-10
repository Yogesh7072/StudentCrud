package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public interface StudentI {
	public Student saveStudent(Student s);

	public List<Student> saveAllStudent(Student s);

	public Student getStudent(int id);

	public List<Student> findAllStudent();

	public Student updateStudent(Student s);

	public boolean deleteStudent(int id);

	List<Student> saveAllStudent(List<Student> s);

}
