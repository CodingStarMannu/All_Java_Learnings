package oopsinjava;
import java.util.Scanner;
public class StudentUse3 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in)// scanner need a constraint ..we have to provide source to it i.e. System.in here
		Student s1 = new Student("Manisha", 4); //constructor is called here when a object is created.
		
//		s1 .name = "Manisha";
//		System.out.println("s1 " + s1);
//		s1.setRollNumber(100);
		
		System.out.println(s1.name + " "+ s1.getRollNumber());

		
		Student s2 = new Student("Manoj", 5);//specifying the values is must when we use constructor.
//		s2 .name = "Manoj";
//		System.out.println("s2 " + s2);
//		s2.setRollNumber(100);
		System.out.println(s2.name + " "+ s2.getRollNumber());
		
	}

}
