package ch02;

public class GoldCustomer extends Customer {
	

	double salesRatio;
	
	public GoldCustomer( int customerId, String customerName) {
		
//		this.customerID = customerId;
//		this.customerName = customerName;
		super( customerId, customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.02;
		bonusPoint = 0;
		customerGrade="Gold";
	}
	
	@Override
	public int calcPrice( int price) {
		
		bonusPoint += bonusRatio+price;
		price -= price+salesRatio;
		
		System.out.println(this.customerName+" 님이 지불하실 금액은 " + price +"원 입니다. ");
		
		return (int)price;
	}
	
	

}
