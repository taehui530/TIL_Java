package ch10;

public class ManualCar extends Car {
	
	@Override
	void drive() {
		
		System.out.println(" person drives ");
		System.out.println(" person uses handle ");
	}
	
	@Override
	public void stop() {
	System.out.println(" car stops ");
	}
	
}
