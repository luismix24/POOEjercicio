package org.generation.classes;


public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student (String firstName,String lastName, int registration, int grade, int year) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.registration=registration;
		this.grade=grade;
		this.year=year;
		
	}//constructor 1
    
    public Student(String firstName, String lastName, int registration) {
		this(firstName,lastName, registration,1,2);
	}//constructor 2
	
    public Student(String firstName, String lastName) {
    	this(firstName,lastName,101516,1,2);
    }
//	}//constructor 3
    
    public void printFullName(){
    	System.out.println(firstName + " "+lastName);
    	}

     public boolean isApproved(){
    	 return grade >=60;
     }//IsApproved

     public int changeYearIfApproved(){
    	 if (isApproved()) {
             year += 1;
             System.out.println("Congratulations!");
         }//if
         return year;
     }//changeYearIfApproved

}// class Student
