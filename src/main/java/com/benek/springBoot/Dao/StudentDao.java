package com.benek.springBoot.Dao;

import java.util.Collection;

import com.benek.springBoot.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int Id);

	void removeStudentById(int id);

	void updateStudent(Student student);

	void insertStudentToOb(Student student);

}