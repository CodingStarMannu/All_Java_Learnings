package oopsconcept;

import java.util.Scanner;

public class NewStudentUse {

	public static void main(String[] args)// here in main public is because everyone can use it.. static because we do not need to create a class{
		
//		System.out.println(NewStudent.numStudents);//this is the correct way to access a static variable.
		
		NewStudent s1 = new NewStudent("Manoj", 150);
		
		NewStudent s2 = new NewStudent("Charu", 130);
		
		System.out.println(s1.getNumStudent());// this is not correct way to access we dont need object to access static variable we should have use class access the static variable  
		System.out.println(s2.getNumStudent());// this will print the count of students.
		
		
		

	}

}
