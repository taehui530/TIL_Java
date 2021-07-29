package ch09;

public class DeskTop extends Computer {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println(" DeskTop display ");
		
	}

	@Override
	void typing() {
		// TODO Auto-generated method stub
		System.out.println(" DeskTop typing ");
		
	}
	
	@Override
	public void turnOff(){
		
		System.out.println( "DeskTop turnOff");
	}
	
	@Override
	void turnOn() {
		
		System.out.println( "DeskTop turnOn");
	}

	
}
