package ch14;

public class Taxi {
	
	String taxiCompanyName;
	int passengerCount;
	int money;
	
	Taxi(String taxiCompanyName){
		
		this.taxiCompanyName = taxiCompanyName;
	}
	
	public void takeTaxi(int money) {
		
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo() {
		
		System.out.println(taxiCompanyName+"�ý� ������ "+money	+ "�Դϴ�.");
	}

}
