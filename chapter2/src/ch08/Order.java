package ch08;

public class Order {
	
	long orderNum;
	int phoneNum;
	String address;
	int orderDate;
	int orderTime;
	int orderPrice;
	int menuNum;
	
	public Order( long orderNum, int phoneNum, String address, int orderDate, int orderTime, int orderPrice, int menuNum) {
		
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNum = menuNum;
	}
	
	public void showOrderInfo() {
		System.out.println(" �ֹ� ���� ��ȣ  : " + orderNum );
		System.out.println(" �ֹ� �ڵ��� ��ȣ : " + phoneNum );
		System.out.println(" �ֹ� �� �ּ� : " + address );
		System.out.println(" �ֹ� ��¥ : " + orderDate);
		System.out.println(" �ֹ� �ð� : " + orderTime);
		System.out.println(" �ֹ� ���� : " + orderPrice);
		System.out.println(" �޴� ��ȣ : " + menuNum);
	}
	

}
