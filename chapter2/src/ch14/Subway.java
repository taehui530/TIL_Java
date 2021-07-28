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
		System.out.println(lineNum + "호선 지하철의 승객은 "+passengerCount+"이고, 수입은 "+money+"원 입니다.");
	}
}
