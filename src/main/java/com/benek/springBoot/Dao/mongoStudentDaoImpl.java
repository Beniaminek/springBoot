package com.benek.springBoot.Dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.benek.springBoot.Entity.Student;

@Repository
@Qualifier("mongoData")
public class mongoStudentDaoImpl implements StudentDao{
	
	

	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>(){
			{
				add(new Student(1, "Maria", "Nothing"));
			}
		};
	}

	public Student getStudentById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeStudentById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void insertStudentToOb(Student student) {
		// TODO Auto-generated method stub
		
	}

}
