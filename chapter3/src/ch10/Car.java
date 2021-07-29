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
	
	//���ø��޼��� : final. ���� Ŭ�������� ������ �� �� ����.
	final public void run() {
		
		startCar();
		drive();
		stop();
		turnOff();
	}
}
