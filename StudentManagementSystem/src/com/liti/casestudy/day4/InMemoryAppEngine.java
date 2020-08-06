package com.liti.casestudy.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InMemoryAppEngine implements AppEngine {
	
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Enroll> enrollments = new ArrayList<Enroll>();

	@Override
	public void register(Student student) {
		students.add(student);
		
	}

	@Override
	public void introduce(Course course) {
		courses.add(course);
		
	}

	@Override
	public void enroll(Student student, Course course) {
		Enroll enroll = new Enroll(student, course,LocalDate.now());
		enrollments.add(enroll);
		students.add(student);
		courses.add(course);
		
	}

	@Override
	public List<Student> listOfStudents() {
		return students;
	}
	
	public List<Course> listOfCourses() {
		return courses;
	}

	@Override
	public List<Enroll> listOfEnrollments() {
		return enrollments;
	}
	

	

}
