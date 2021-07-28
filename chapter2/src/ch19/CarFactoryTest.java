package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		//자동차 공장은 유일한 객체 (조건)
		CarFactory factory = CarFactory.getInstance(); //new없이 객체생성.싱글톤 패턴
		
		Car mySonata = factory.createCar(); 
		Car yourSonata = factory.createCar(); 
		//createCar에서 static으로 고유번호 선언 필요.
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());

	}

}
