package ch19;

public class CarFactory {
	
	//싱글톤 패턴
	
	//1. private 생성자
	private CarFactory() {}
	
	//2. private static 인스턴스
	private static CarFactory instance = new CarFactory();
	
	//3. public static한 접근메서드
	public static CarFactory getInstance() {
		
		if( instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	private static int carNum = 10001;
	
	public static int getCarNum(){
		
		return carNum;
		
	} 
	
	public static Car createCar() {
		
		
		Car sonata = new Car(carNum);
		carNum++;
		
		return sonata;
	}
}
