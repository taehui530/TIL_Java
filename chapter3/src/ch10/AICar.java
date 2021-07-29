package ch10;

public class AICar extends Car {
	
	@Override
	void drive() {
		
		System.out.println(" AI drives ");
		System.out.println(" AI handles car ");
	}
	
	@Override
	public void stop() {
	System.out.println(" AI stops ");
	}

}
