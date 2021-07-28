package ch02;

public class VipCustomer extends Customer {

	double salesRatio;
	private int agentId;
	private static int agentNum = 1000;
	
	public VipCustomer() {
		
//		super( 0,  " no name "); //customer class�� ����Ʈ �����ڰ� ���.
		this.salesRatio = 0.1;
		this.customerGrade="VIP";
		this.bonusRatio=0.05;
		this.agentId = agentNum++;
		
		System.out.println(" VipCustomer() call ");
	}
	
	public VipCustomer( int customerID, String customerName) {
		
//		super( customerID, customerName ); ��� ���� �� �⺻������ ȣ��
		
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
		System.out.println(this.customerName+" ���� �����Ͻ� �ݾ��� " + price +"�� �Դϴ�. ");
		return (int)price;
	}
	
	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() + " ��� ���� ��ȣ��, " + agentId + " �Դϴ�. ";
		
	}
	
	
}
