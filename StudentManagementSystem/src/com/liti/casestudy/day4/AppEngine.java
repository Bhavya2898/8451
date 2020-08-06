package com.liti.casestudy.day4;

import java.util.List;

public interface AppEngine {
	public void register(Student student);
	public void introduce(Course course);
	public void enroll(Student student,Course course);
	public List<Student>listOfStudents();
	public List<Enroll>listOfEnrollments();
	public List<Course> listOfCourses();

}
