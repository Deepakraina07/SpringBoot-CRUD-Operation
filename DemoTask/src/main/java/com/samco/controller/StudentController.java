package com.samco.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samco.model.Student;
import com.samco.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired 
	StudentService studentService;
	
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getStudent")
	public List<Student> getStudent() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getByStudent(@PathVariable("id") int id) {
		return studentService.findByStudent(id);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent() {
		studentService.deleteStudent();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteByStudent(@PathVariable("id") int id) {
		studentService.deleteByStudent(id);
	}
}
