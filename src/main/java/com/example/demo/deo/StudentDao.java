package com.example.demo.deo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import com.example.demo.repositry.StudentRepo;
import com.example.demo.service.StudentI;
@Repository
public class StudentDao implements StudentI {
@Autowired
StudentRepo srepo;

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		
		Student save = srepo.save(s);
		return save;
	}

	@Override
	public List<Student> saveAllStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}