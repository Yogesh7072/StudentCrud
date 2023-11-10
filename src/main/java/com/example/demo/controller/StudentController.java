package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentImp;

@RestController
public class StudentController {

	@Autowired
	StudentImp studentService;

	@PostMapping(value = "/saveStudent", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Student> saveSingleEntity(@RequestBody Student student) {

		Student stu = studentService.saveStudent(student);
		if (stu != null) {

			return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
		} else {

			return new ResponseEntity<Student>(stu, HttpStatus.BAD_REQUEST);

		}

	}

	@PostMapping(value = "/saveAllStudent", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<List<Student>> saveAllEntity(@RequestBody List<Student> student) {

		List<Student> saveAllStudent = studentService.saveAllStudent(student);
		if (saveAllStudent != null) {

			return new ResponseEntity<List<Student>>(saveAllStudent, HttpStatus.OK);
		} else {

			return new ResponseEntity<List<Student>>(saveAllStudent, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "/getStudent/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> getSingleEntity(@PathVariable int id) {
		Student student = studentService.getStudent(id);
		if (student != null) {
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} else {

			return new ResponseEntity<Student>(student, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping(value = "/getAllStudent", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Student>> getAllEntity() {

		ArrayList<Student> stu = new ArrayList<Student>();

		List<Student> findAllStudent = studentService.findAllStudent();

		if (findAllStudent != null) {

			return new ResponseEntity<List<Student>>(findAllStudent, HttpStatus.OK);
		} else {

			return new ResponseEntity<List<Student>>(findAllStudent, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/updateStudent", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<Student> updateEntity(@RequestBody Student student) {

		Student stu = student;

		return new ResponseEntity<Student>(stu, HttpStatus.OK);

	}

	@DeleteMapping(value = "/deleteStudent/{id}", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<String> deleteEntity(@PathVariable int id) {

		String s = "";
		return new ResponseEntity<String>(HttpStatus.OK);

	}

}
