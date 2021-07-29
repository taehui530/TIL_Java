package ch14;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int x, int y) {
		
		return x*y;
	}

	@Override
	public int devide(int x, int y) {
		if ( y ==0) {
			
			return ERROR;
		}
		
		
		return x/y;
	}
	
	//인터페이스Calc타입으로 형변환하여 인스턴스생성 시 사용못하는 메서드
	// Calc calc = new CompleteCalc();
	//calc.showInfo() --> (x)
	public void showInfo() {
		
		System.out.println(" success ");
	}
	
	@Override
	public void description() {
		
		System.out.println(" Complete Calc description ( overrided )");
	}

}
