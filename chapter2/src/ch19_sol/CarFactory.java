package ch19_sol;

public class CarFactory {
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		
		if (instance==null) {
			
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	public static Car createCar() {
		
		Car car = new Car();
		
		return car;
	}
	
			
	
}
