package com.samco.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samco.model.Student;
import com.samco.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAllStudent() {
		List<Student> stu = new ArrayList<Student>();
		studentRepository.findAll().forEach(student -> stu.add(student));
		return stu;
	}
	
	public Student findByStudent(int id) {
		return studentRepository.findById(id).get();
	}
	
	public Student updateStudent(Student student) {
		return studentRepository.save(addStudent(student));
	}
	
	public void deleteStudent() {
		studentRepository.deleteAll(getAllStudent());
	}
	
	public void deleteByStudent(int id) {
		 studentRepository.deleteById(id);
	}
}
