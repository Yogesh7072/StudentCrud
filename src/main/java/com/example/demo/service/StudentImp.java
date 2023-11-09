package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deo.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentImp implements StudentI {

	@Autowired
	StudentDao studentDao;

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub

		Student saveStudent = studentDao.saveStudent(s);

		return saveStudent;
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
