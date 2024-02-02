package inheritance;


//String class in java is final.

//public final class Vehicle {// if we make class final than it is not extended anywhere.
	
	public abstract class Vehicle {
	//	final private String color;
	 private String color;//if we make any variable private than we can access this variable by making getter and setter;
	public int maxSpeed;
	private int number;
	protected String name;
	
	
	public Vehicle(int maxSpeed) {
//		color = "red";// we have to use atleast once in every method if it is assigned to final.
		System.out.println("Vehicle's Consturctor");
		this.maxSpeed = maxSpeed;
	}
	
	 public Vehicle() {
		 
//		 color ="Blue";// for final
		 System.out.println("Vehicle's Consturctor"); 
	 }
	
	 

	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	
	
	public void print() {
	System.out.println("Vehicle " + " color " + color + " maxspeed " + maxSpeed);

	}
//	final public void print() {
//		System.out.println("Vehicle " + " color " + color + " maxspeed " + maxSpeed);
//
//		}
	
	
	public void set(int number) {
//		number = number;//this will print 0;
		this.number = number;//this will print the required ans. 
	}
	public int get() {
		return number;
	}
	public abstract boolean isMotorized();//we use astract keyword to force the function on all the inheritated classes.
	
	public abstract String getCompany();
		
	
} 
	