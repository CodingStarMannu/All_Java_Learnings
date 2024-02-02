package oopsinjava;

public class Student {
	
//	public Student(String n , int num) {
//		//this is called the constructor it is available by default in java. 
//		this.name = n;
//		this.rollnumber = num;
//		
//		//now we have created a constructor so the default constructor is no longer available.
//	}
	
	
	public String name;
	final private int rollnumber;
	double cgpa;
	final double conversionFactor = 0.95;
	
	public Student(String name , int rollnumber) {
		this.name = name;
		this.rollnumber =rollnumber;
	}
	/* Final variable can be initialized only once and cannot be modified further.
We can initialize final variable inside constructor.
Final keyword is a non-access modifier. */
	
//	Getter 
	public int getRollNumber() {
//	return this.rollnumber;	// we can write this.rollnumber here also
	return rollnumber;
	}
	
	
//Setter	
//	public void setRollNumber(int num) {
//		if(num<=0) {
//			return;
//		}
//		rollnumber = num;
//	}
// Using getter and setter is a better choice instead of using the public private keyword .we use getter setter a lot in web development

	
	public void setRollNumber(int rollnumber) {
		if(rollnumber<=0) {
			return;
		}
		System.out.println("set roll number Function " + this);
		this.rollnumber = rollnumber;
	}
	
	//'this' keyword is a reference variable that refers to the current object.
	
	// By writing this we can access all the properties of the object. It is a good practice to write properties via this 
}
