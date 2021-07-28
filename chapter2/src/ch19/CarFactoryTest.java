package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		//�ڵ��� ������ ������ ��ü (����)
		CarFactory factory = CarFactory.getInstance(); //new���� ��ü����.�̱��� ����
		
		Car mySonata = factory.createCar(); 
		Car yourSonata = factory.createCar(); 
		//createCar���� static���� ������ȣ ���� �ʿ�.
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
