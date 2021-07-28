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
		System.out.println(" 주문 접수 번호  : " + orderNum );
		System.out.println(" 주문 핸드폰 번호 : " + phoneNum );
		System.out.println(" 주문 집 주소 : " + address );
		System.out.println(" 주문 날짜 : " + orderDate);
		System.out.println(" 주문 시간 : " + orderTime);
		System.out.println(" 주문 가격 : " + orderPrice);
		System.out.println(" 메뉴 번호 : " + menuNum);
	}
	

}
