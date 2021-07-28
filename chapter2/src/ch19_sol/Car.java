package ch19_sol;

public class Car {
	
	private static int serialNum = 10001;
	private int carNum;
	
	public Car(){
		
		this.carNum = serialNum;
		serialNum++;
		
	}
	public static int getSerialNum() {
		
		return serialNum;
	}
	
	public int getCarNum() {
		
		return carNum;
	}
	
	
	
}
