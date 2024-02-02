package interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface{

	
	// a class can implements multiple interfaces but it can extends only one class.Multiple inheritance is not allowed in java.
	@Override
	public boolean isMotorized() {
		return true;
	}

	@Override
	public String getCompany() {
		return null;
	}
	int x;
	@Override
	public void cal(int item) {
		// TODO Auto-generated method stub
		x = item * item;
	}


	@Override
	public int numGears() {
		return 5;
	}
//	void print() {
//		System.out.println(PI);
//	}
	   public void method(){
	        System.out.println("Class Two method");
	    }

	
}
