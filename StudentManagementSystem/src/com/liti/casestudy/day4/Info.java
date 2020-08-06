package com.liti.casestudy.day4;

public class Info {
	
	public void display(Student student) {
		System.out.println("StudentId:"+student.getid());
		System.out.println("StudentName:"+student.getname());
		System.out.println("DateOfBirth:" +student.getdateOfBirth());
		System.out.println();
		
	}
	
	public void display(Course course) {
		System.out.println("CourseId: "+course.getId());
		System.out.println("CourseName: "+course.getName());
		System.out.println("CourseDuration: " +course.getDuration());
		System.out.println("courseFees: "+course.getFees());
		
		
	}
	
	public void display(Enroll enroll) {
		System.out.println("Enrollment Date: "+enroll.getEnrollmentDate());
		display(enroll.getCourse());
		display(enroll.getStudent());
		
	}

	

}

