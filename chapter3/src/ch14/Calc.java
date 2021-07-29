package ch14;

public interface Calc {
	
	//**인터페이스의 구성 요소 **
	
	//1. 상수
	static final double PI = 3.14;
	static final int ERROR = 1999999;
	
	//2. 추상메서드
	int add( int x, int y );
	int substract( int x, int y);
	int times( int x, int y);
	int devide( int x, int y);
	
	//3. [default] 메서드 : 구현클래스들의 공통기본메서드. 재정의 가능. 인스턴스생성 후에만 사용가능 
	default void description() {
		
		System.out.println(" calculator description ");
		
		myPrivateMethod(); //private method
	}
	
	//4. [static] 메서드 : 인스턴스 생성과 상관없이 사용가능
	static int sumOfResults( int[] arr) {
		
		int sum = 0;
		
		for ( int i: arr) {
			
			sum += i;
		}
		myPrivateStaticMethod(); //private method
		return sum;
	}
	
	//5.[private] 메서드 : 구현된 클래스에서 사용 X, 재정의 X, 오직 interface내부에서만 사용가능.
	// 인터페이스의 default method, static method 내부에서 사용
	
	private void myPrivateMethod() {
		
		System.out.println("myPrivateMethod in defaul method ");
	}
	
	private static void myPrivateStaticMethod() {
		
		System.out.println("myPrivateMethod in static method ");
	}
	
}
