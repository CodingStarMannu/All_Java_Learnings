package generics;

public class Vehicle implements PrintInterface {
	int maxSpeed ;
	String Company;
	
	public Vehicle (int maxSpeed ,String Company) {
		super();
		this.maxSpeed = maxSpeed;
		this.Company = Company;
	}
	
	public void print() {
		System.out.println(maxSpeed + " " + Company);
	}
}
