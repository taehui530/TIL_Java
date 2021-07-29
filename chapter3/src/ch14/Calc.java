package ch14;

public interface Calc {
	
	//**�������̽��� ���� ��� **
	
	//1. ���
	static final double PI = 3.14;
	static final int ERROR = 1999999;
	
	//2. �߻�޼���
	int add( int x, int y );
	int substract( int x, int y);
	int times( int x, int y);
	int devide( int x, int y);
	
	//3. [default] �޼��� : ����Ŭ�������� ����⺻�޼���. ������ ����. �ν��Ͻ����� �Ŀ��� ��밡�� 
	default void description() {
		
		System.out.println(" calculator description ");
		
		myPrivateMethod(); //private method
	}
	
	//4. [static] �޼��� : �ν��Ͻ� ������ ������� ��밡��
	static int sumOfResults( int[] arr) {
		
		int sum = 0;
		
		for ( int i: arr) {
			
			sum += i;
		}
		myPrivateStaticMethod(); //private method
		return sum;
	}
	
	//5.[private] �޼��� : ������ Ŭ�������� ��� X, ������ X, ���� interface���ο����� ��밡��.
	// �������̽��� default method, static method ���ο��� ���
	
	private void myPrivateMethod() {
		
		System.out.println("myPrivateMethod in defaul method ");
	}
	
	private static void myPrivateStaticMethod() {
		
		System.out.println("myPrivateMethod in static method ");
	}
	
}
