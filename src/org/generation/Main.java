package org.generation;
import org.generation.classes.Courses;
import org.generation.classes.Student;

public class Main {

	public static void main(String[] args) {
		Student luis = new Student("Arturo","Ramirez",101520,80,2);
		Student Ariel = new Student("Ariel","Dominguez",101522,58,1);
		Student Arely = new Student("Arely","Mendez",101523,95,1);
		Student Roberto = new Student("Roberto","Guzman",101524,95,1);
		
		luis.printFullName();
        System.out.println("Is approved: " + luis.isApproved());
        luis.changeYearIfApproved();
        
        Courses course = new Courses("Programación", "Jc", 2024);
        course.enroll(luis);
        course.enroll(Ariel);
        course.enroll(Arely);
        course.enroll(Roberto);
        System.out.println("Mejor calificación:  " + course.bestGrade());

	}//main

}
