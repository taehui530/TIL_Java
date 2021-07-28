package ch02;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		
		customerGrade = "SILVER"; 
		this.bonusRatio = 0.01;
		
		System.out.println(" Customer() call ");
		
	}
	
	public Customer( int customerID, String customerName) {
		
		this.customerID = customerID;
		this.customerName = customerName;
		
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
		
		System.out.println(" Customer( int customerID, String customerName ) call ");
	}
	
	
	public int calcPrice( int price) {
	bonusPoint += price * bonusRatio;
	
	System.out.println(this.customerName+" ���� �����Ͻ� �ݾ��� " + price +"�� �Դϴ�. ");
	return price;
	}
	
	public String showCustomerInfo() {
		
		return customerName + "���� ����� "+ customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.  " +"(ȸ����ȣ : "+customerID +")";
		
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
