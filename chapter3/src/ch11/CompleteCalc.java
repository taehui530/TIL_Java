package ch11;

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
	
	//�������̽�CalcŸ������ ����ȯ�Ͽ� �ν��Ͻ����� �� �����ϴ� �޼���
	// Calc calc = new CompleteCalc();
	//calc.showInfo() --> (x)
	public void showInfo() {
		
		System.out.println(" success ");
	}

}
