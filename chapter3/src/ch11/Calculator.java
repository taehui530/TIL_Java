package ch11;

public abstract class Calculator implements Calc {

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	

}
