package ch02;

public class VipCustomer extends Customer {

	double salesRatio;
	private int agentId;
	private static int agentNum = 1000;
	
	public VipCustomer() {
		
//		super( 0,  " no name "); //customer class에 디폴트 생성자가 없어서.
		this.salesRatio = 0.1;
		this.customerGrade="VIP";
		this.bonusRatio=0.05;
		this.agentId = agentNum++;
		
		System.out.println(" VipCustomer() call ");
	}
	
	public VipCustomer( int customerID, String customerName) {
		
//		super( customerID, customerName ); 명시 안할 시 기본생성자 호출
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		this.agentId = agentNum++;
		this.salesRatio = 0.1;
		this.customerGrade="VIP";
		this.bonusRatio=0.05;
		
		System.out.println(" VipCustomer(int, Stirng) call ");
		
	}
	
	
	
	public int getAgentId() {
		
		return agentId;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= price*salesRatio;
		System.out.println(this.customerName+" 님이 지불하실 금액은 " + price +"원 입니다. ");
		return (int)price;
	}
	
	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() + " 담당 상담원 번호는, " + agentId + " 입니다. ";
		
	}
	
	
}
