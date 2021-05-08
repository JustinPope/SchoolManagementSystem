package SchoolManagementSystem;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Justin Pope
 * Created on 2021-05-03
 *
 */
public class Main {

	/**
	public static void main(String[] args) {
		
		Teacher Kenneth = new Teacher("Kenneth Kim", 1, 300);
		Teacher Lawson = new Teacher("Andy Lawson", 2, 250);
		Teacher Selzer = new Teacher("Jessica Selzer", 3, 350);
		
		List<Teacher> Teachers = new ArrayList<>();
		
		Teachers.add(Kenneth);
		Teachers.add(Lawson);
		Teachers.add(Selzer);
		
		Student Kat = new Student("Kat Marques", 1, 2);
		Student Jacob = new Student("Jacob Roberts", 2, 3);
		Student Harry = new Student("Harry Schiele", 3, 1);

		List<Student> Students = new ArrayList<>();
		
		Students.add(Kat);
		Students.add(Jacob);
		Students.add(Harry);
		
		School SFU = new School(Teachers, Students);
		
		System.out.println("SFU has earned: " + SFU.getTotalMoneyEarned());
		Kat.payFees(15000);
		System.out.println("SFU has earned: " + SFU.getTotalMoneyEarned());
		Jacob.payFees(20000);
		System.out.println("SFU has earned: " + SFU.getTotalMoneyEarned());
		Kenneth.receieveSalary(Kenneth.getSalary());
		Lawson.receieveSalary(Lawson.getSalary());
		Selzer.receieveSalary(Selzer.getSalary());
		System.out.println("SFU has earned: " + SFU.getTotalMoneyEarned());
		System.out.println(Kat);
		System.out.println(Selzer);
	}
	*/
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int option;
		String teachersName;
		int counter = 0;
		int otherCounter = 0;
		int salary;
		int year;
		String studentsName;
		String schoolName;
		List<Teacher> Teachers = new ArrayList<>();
		List<Student> Students = new ArrayList<>();
		
		System.out.println("What is your schools name?");
		schoolName = in.next();
		
		while(true) {
			System.out.println("Would you like to add a new teacher to your school? 1: Yes	2: No");
			option = Integer.parseInt(in.next());
			if(option == 1) {
				System.out.println("What is the teachers name?");
				teachersName = in.next();
				System.out.println("what is the teachers salary?");
				salary = Integer.parseInt(in.next());
				Teacher temp = new Teacher(teachersName, counter++, salary);
				Teachers.add(temp);
			} else if(option == 2) {
				while(true) {
					System.out.println("Would you like to add a new student to your school? 1: Yes	2: No");
					option = Integer.parseInt(in.next());
					if(option == 1) {
						System.out.println("What is the students name?");
						studentsName = in.next();
						System.out.println("what year is the student in?");
						year = Integer.parseInt(in.next());
						Student temp = new Student(studentsName, otherCounter++, year);
						Students.add(temp);
					} else if(option == 2) {
						while(true) {
							School tmap = new School(Teachers, Students);
							System.out.println("Your school " + schoolName + " has been created!");
							System.out.println("Would you like to view earnings? 1: Yes		2: No");
							option = Integer.parseInt(in.next());
							if(option == 1) {
								System.out.println(schoolName + " has earned: " + tmap.getTotalMoneyEarned());
							} else if(option == 2) {
								break;
							}
						}
					} 
				}
			} 
		}
	}

}
