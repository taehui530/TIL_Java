package ch19;

public class CarFactory {
	
	//�̱��� ����
	
	//1. private ������
	private CarFactory() {}
	
	//2. private static �ν��Ͻ�
	private static CarFactory instance = new CarFactory();
	
	//3. public static�� ���ٸ޼���
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
