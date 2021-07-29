package ch15.interface_Inheritance;

public class MyClass implements XY {

	@Override
	public void x() {
		System.out.println("myclass override : x() _interface x");
	}

	@Override
	public void y() {
		System.out.println("myclass override : y() _interface y");		
	}

	@Override
	public void XYmethod() {
		System.out.println("myclass override : xy()_interface xy");
		
	}

}
