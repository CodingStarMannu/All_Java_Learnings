package oopsconcept;

public class NewStudent {
	public String name;
	final private int rollNumber;
	double cgpa;
	public final static double conversionFactor = 0.95;
	private static int numStudents;// Static properties are those properties shared by all objects and they belong to class and not object.. Static belongs to class other variable are belongs to objects
	
	public NewStudent(String name, int rollNumber) {
		this.name = name;
		this.rollNumber =numStudents;
		numStudents++;//to increase the number of students every time.
	}
	
	public static int getNumStudent() {
//		System.out.println(rollNumber);
		return numStudents;
	}
	
 public NewStudent() {
	 name = "abc";
	 numStudents++;
	 this.rollNumber = numStudents;
	 
 }
	
	
	
}
