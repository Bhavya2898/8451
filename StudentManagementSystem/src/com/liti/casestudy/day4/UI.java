package com.liti.casestudy.day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class UI {
	
	private Scanner scanner = new Scanner(System.in);
	private AppEngine appEngine = new InMemoryAppEngine();
	private Info info = new Info();
	
	public void showMainScreen() {
		System.out.println("Welcome to SMS(Student Management System) v1.0");
		System.out.println("Tell us who are you(1.Student or 2.Admin)");
		System.out.println("Enter you choice (1 or 2)");
		Scanner scanner = new Scanner(System.in);
		
		int choice = Integer.parseInt(scanner.nextLine());
		switch(choice) {
		case 1:
			showStudentScreen();
			break;
		case 2:
			showAdminScreen();
			break;
		}
		
	}
	
	public void showAdminScreen() {
		System.out.println("Welcome Admin");
		System.out.println("1.Add new course\n2.Browse all the course\n3.Browse all the students\n4.showAllEnrollment");;
		System.out.println("Enter you choice (1 - 3)");
		
		
		int choice = Integer.parseInt(scanner.nextLine());
		switch(choice) {
		case 1:
			showAddCourseScreen();
			break;
		case 2:
			showAllCourseScreen();
			break;
		case 3:
			showAllStudentsScreen();
			break;
		case 4:
			showAllEnrollmentScreen();
			break;
		}
		scanner.close();
		
		
		
	}

	
	public void showStudentScreen() {
		System.out.println("Welcome Student!");
		System.out.println("1.Register\n2.Browse all the courses\n3.Enroll for course");
		System.out.println("Enter your choice(1-3) ");
		
		int choice = Integer.parseInt(scanner.nextLine());
		switch(choice) {
		case 1:
			showRegisterScreen();
			break;
		case 2:
			showAllCourseScreen();
			break;
		case 3:
			showEnrollCourseScreen();
			break;
			
		}
		
		
		
		
		
		
	}
	
	public void showRegisterScreen() {
		Student student = new Student();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter your id :  ");
		student.setid(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter your name :  ");
		student.setname(scanner.nextLine());
		System.out.println("Enter your date of birth :  ");
		student.setdateOfBirth(LocalDate.parse(scanner.nextLine(),formatter));
		
		appEngine.register(student);
		
		System.out.println("Registraion successful!");
		showMainScreen();
		
		
	}

	
	
	public void showEnrollCourseScreen() {
		List<Student> students = appEngine.listOfStudents();
		List<Course> courses = appEngine.listOfCourses();
		
		Enroll enroll = new Enroll();
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		for(Student student: students){
			if(student.getname().equalsIgnoreCase(name)) {
				enroll.setStudent(student);
				break;
			}
			else {
				
			}
		}
		
	}


	private void showAllCourseScreen() {
		appEngine.listOfCourses();
		List<Course> courses = appEngine.listOfCourses();
		System.out.println("Course Id: \n Course name\nCourse fee\nCourse duration");
		for(Course course : courses) {
			System.out.println(course.getId()+course.getName()+course.getFees()+course.getDuration());
			
		}
		
		
	}


	private void showAllStudentsScreen() {
		List<Student> students = appEngine.listOfStudents();
		students.forEach(student -> info.display(student));
		//showMainScreen();
		System.out.println();
		
		
	}

	private void showAddCourseScreen() {
		
		List<Course> courses = appEngine.listOfCourses();
		
		
	}


	private void showAllEnrollmentScreen() {
		// TODO Auto-generated method stub
		
	}

	

}
