package ch14;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	Bus(int busNum){
		this.busNum = busNum;
	}
	
	public void take(int money) {
		
		this.passengerCount++;
		this.money+=money;
	}
	
	public void showInfo() {
		System.out.println(busNum + "�� ������ �°��� "+passengerCount+"�̰�, ������ "+money+"�� �Դϴ�.");
	}
}
