package ch14;

public class Subway {
	
	int lineNum;
	int passengerCount;
	int money;
	
	Subway(int lineNum){
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		
		this.passengerCount++;
		this.money+=money;
	}
	
	public void showInfo() {
		System.out.println(lineNum + "ȣ�� ����ö�� �°��� "+passengerCount+"�̰�, ������ "+money+"�� �Դϴ�.");
	}
}
