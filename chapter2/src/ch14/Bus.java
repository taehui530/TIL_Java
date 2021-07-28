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
		System.out.println(busNum + "번 버스의 승객은 "+passengerCount+"이고, 수입은 "+money+"원 입니다.");
	}
}
