package ch15.interface_Inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		
		System.out.println("******myclass*****");
		MyClass mClass = new MyClass();
		mClass.x();
		mClass.y();
		mClass.XYmethod();
		
		System.out.println("******xType*****");
		X xType = mClass;
		xType.x();
		
		
		System.out.println("******yType*****");
		Y yType = mClass;
		yType.y();
		
		
		System.out.println("******xyType*****");
		XY xyType = mClass;
		xyType.x();
		xyType.y();
		xyType.XYmethod();
		
		
	}

}
