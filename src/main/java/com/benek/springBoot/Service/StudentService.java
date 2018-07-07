package com.benek.springBoot.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.benek.springBoot.Dao.StudentDao;
import com.benek.springBoot.Entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier("fakeData")
	private StudentDao fakeStudentDaoImpl;
	
	public Collection<Student> getAllStudents(){
		return this.fakeStudentDaoImpl.getAllStudents();
	}
	
	public Student getStudentById(int Id) {
		return this.fakeStudentDaoImpl.getStudentById(Id);
	}

	public void removeStudentById(int id) {
		this.fakeStudentDaoImpl.removeStudentById(id);
	}
	
	public void updateStudent(Student student) {
		this.fakeStudentDaoImpl.updateStudent(student);
	}

	public void insertStudent(Student student) {
		this.fakeStudentDaoImpl.insertStudentToOb(student);
	}
}
