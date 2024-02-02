package inheritance;

public abstract class Bicycle extends Vehicle {
	
	boolean Gears = true;

	@Override
	public boolean isMotorized() {
		return false;
	}

}
