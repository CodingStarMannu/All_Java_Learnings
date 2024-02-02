package inheritance;

//public abstract class Car extends Vehicle{ // we can make Car class also abstract to but than we can not create variables of Car also. We can complete the abstract method which is incomplete to overcome the error and run code smoothly. 
	public abstract class Car extends Vehicle{
	

	
	int numDoors;
	int numGears;
	
	
	public Car() {
//		super(100); 
		System.out.println("Car's Constructor");
		numDoors =4;
		numGears =5;
	}
	public Car(int numDoors, int maxSpeed) {
		super(maxSpeed);//it call to parent constructor, it should be the first call in the derived class otherwise it will throw error
		System.out.println("Car's Constructor");
		this.numDoors = numDoors;
	}
	
	public  void print() {
		super.print();
//		System.out.println("Car "+ " color "+ color + " maxspeed "+ " numdoors "+ numDoors);
		System.out.println("Car " + " maxspeed "+ " numdoors "+ numDoors);
		
	}
	public void printMaxspeed() {
		super.maxSpeed =160;
		System.out.println(maxSpeed + " "+ super.maxSpeed);
	}
	
	@Override
	public boolean isMotorized() {

		return true;
	}

	


}
