package com.benek.springBoot.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.benek.springBoot.Entity.Student;

@SuppressWarnings("serial")
@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Bartek", "IT"));
				put(2, new Student(2, "Olek", "Finanse"));
				put(3, new Student(3, "Ania", "Matematyka"));
			}
		};
	}
	
	/* (non-Javadoc)
	 * @see com.benek.springBoot.Dao.StudentDao#getAllStudents()
	 */
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	/* (non-Javadoc)
	 * @see com.benek.springBoot.Dao.StudentDao#getStudentById(int)
	 */
	public Student getStudentById(int Id) {
		return this.students.get(Id);
	}

	/* (non-Javadoc)
	 * @see com.benek.springBoot.Dao.StudentDao#removeStudentById(int)
	 */
	public void removeStudentById(int id) {
		this.students.remove(id);
	}
	
	/* (non-Javadoc)
	 * @see com.benek.springBoot.Dao.StudentDao#updateStudent(com.benek.springBoot.Entity.Student)
	 */
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(student.getId(), student);
	}

	/* (non-Javadoc)
	 * @see com.benek.springBoot.Dao.StudentDao#insertStudentToOb(com.benek.springBoot.Entity.Student)
	 */
	public void insertStudentToOb(Student student) {
		this.students.put(student.getId(), student);
	}
}
