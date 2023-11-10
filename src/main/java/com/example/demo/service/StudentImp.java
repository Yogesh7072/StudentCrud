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
	public List<Student> saveAllStudent(List<Student> s) {
		// TODO Auto-generated method stub

		List<Student> saveAllStudent = studentDao.saveAllStudent(s);

		return saveAllStudent;
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub

		Student oldstudent = studentDao.getStudent(s.getId());

		if (oldstudent != null) {

			if (s.getNumber() != null)
				oldstudent.setNumber(s.getNumber());
			if (s.getsName() != null)
				oldstudent.setsName(s.getsName());

			Student saveStudent = studentDao.saveStudent(oldstudent);
			return saveStudent;
		} else {

			return null;
		}
	}

	@Override
	public boolean deleteStudent(int id) {
		
		// TODO Auto-generated method stub
		
		boolean deleteStudent = studentDao.deleteStudent(id);
		
		return deleteStudent;
	}

	@Override
	public List<Student> saveAllStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub

		List<Student> findAllStudent = studentDao.findAllStudent();

		return findAllStudent;
	}

}
