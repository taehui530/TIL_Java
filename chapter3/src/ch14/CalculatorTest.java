package ch14;

public class CalculatorTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		int x=40;
		int y=2;
	
		System.out.println(calc.add(x, y));
		System.out.println(calc.substract(x, y));
		System.out.println(calc.times(x, y));
		System.out.println(calc.devide(x, y));
//		System.out.println(calc.showInfo(x, y)); 인터페이스에는 선언되지않은 메서드
		calc.description();
		System.out.println("*************");
		
		CompleteCalc calc2 = new CompleteCalc(); 
		calc2.showInfo();
		calc2.description();
		
		
		System.out.println("*************");
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println( Calc.sumOfResults(arr1));// 인터페이스의 static method. 인스턴스생성없이 사용가능.
	}

}
