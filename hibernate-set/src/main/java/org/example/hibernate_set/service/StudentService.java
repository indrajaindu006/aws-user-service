package org.example.hibernate_set.service;

import java.util.List;

import org.example.hibernate_set.model.Student;

public interface StudentService {

	public Student createStudent(Student student);

	public List<Student> displayAllStudents();

	public Student findById(int id);

	public void deleteById(int id);

	public Student updateById(int id);

}
