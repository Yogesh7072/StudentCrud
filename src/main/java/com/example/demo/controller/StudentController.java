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

		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);

	}

	@PostMapping(value = "/saveAllStudent", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<List<Student>> saveAllEntity(@RequestBody List<Student> student) {

		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);

	}

	@GetMapping(value = "/getStudent/{id}", produces = { "application/json", "application/xml" })
	public ResponseEntity<Student> getSingleEntity(@PathVariable int id) {

		return new ResponseEntity<Student>(HttpStatus.OK);

	}

	@GetMapping(value = "/getAllStudent", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Student>> getAllEntity() {

		ArrayList<Student> stu = new ArrayList<Student>();

		return new ResponseEntity<List<Student>>(stu, HttpStatus.OK);

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
