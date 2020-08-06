package StudentManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		//App.scenerio();
		//App.scenerio1();
		App.scenerio2();
	}

	private static void scenerio1() {
		
		Student st[]=new Student[4];
		st[0] = new Student(1,"Bhavya",LocalDate.of(1992, 10, 12));
		st[1] = new Student(2,"Diwakar",LocalDate.of(1993, 11, 16));
		st[2] = new Student(3,"Sarita",LocalDate.of(1994, 12, 11));
		st[3] = new Student(4,"Abhineet",LocalDate.of(1995, 8, 12));
		Info d = new Info();
		
		
		
		for (int i = 0; i<st.length; i++ ) {
			d.display(st[i]);
			System.out.println(" ");
		}
		
		
		
	}
	
	private static void scenerio2() {
		Info d = new Info();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Number Of Students :");
		int num = console.nextInt();
		
		Student[] students = new Student[num];
		

		
		for (int i=0;i<students.length;i++) {
			
		
		System.out.println("Enter your ID");
		int id = console.nextInt();
		//int id = Integer.parseInt(console.nextLine());
		
		System.out.println("Enter your name");
		String name = console.next();
		
		System.out.println("Enter dateOFBirth");
		
		int day = console.nextInt();
		int month = console.nextInt();
		int year = console.nextInt();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//String dateOfBirth=console.nextLine();
		//LocalDate localdate = LocalDate.parse(dateOfBirth,formatter);
		
		
		
		students[i] = new Student(id, name, LocalDate.of(year, month, day));
		
		}
		
		for(int i=0;i<students.length; i++)
		{
			//d.display(students[i]);
			System.out.println(students[i].getid()+" "+students[i].getname()+" "+students[i].getdateOfBirth());
			
		
			
		}
	
		
	
	}
	
	}



