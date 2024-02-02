package interfaces;

public class VehicleUse {
	
	public static void main(String[]args) {
		
//		Vehicle v = new Vehicle();
////		VehicleInterface vI = new VehicleInterface();//we can not create object of an interface.
//		VehicleInterface vI; //but we can create a reference to achieve polymorphism of a variable.
//		vI = new Vehicle();
//		vI.getCompany();
//		vI.print();
		
//		 Car arr = new Car();
//	        arr.x = 0;     
//	        arr.cal(4);
//	        System.out.print(arr.x);
		
		Vehicle a = new Car();
        a.method();  
	}

}
