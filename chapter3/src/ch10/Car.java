package ch10;

public abstract class Car {
	
	void drive() {}
	void stop() {}
	
	public void startCar() {
		
		System.out.println( " start Car ");
	}

	public void turnOff() {
		
		System.out.println( " turn Off");
	}
	
	//템플릿메서드 : final. 하위 클래스에저 재정의 할 수 없음.
	final public void run() {
		
		startCar();
		drive();
		stop();
		turnOff();
	}
}
