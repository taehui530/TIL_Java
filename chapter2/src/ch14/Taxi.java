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
		
		System.out.println(taxiCompanyName+"택시 수입은 "+money	+ "입니다.");
	}

}
