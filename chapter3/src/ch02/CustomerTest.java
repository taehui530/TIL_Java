package ch02;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Customer customerAnh = new Customer();
		
		customerAnh.setCustomerName(" 안산 ");
		customerAnh.setCustomerID(10010);
		customerAnh.setBonusPoint(1000);
		System.out.println(customerAnh.showCustomerInfo());
	
		System.out.println("======================");
		
		Customer customerLee = new Customer(0, "no name"); //기본 생성자 없을 경우
		
		customerLee.setCustomerName(" 이순신 ");
		customerLee.setCustomerID(10020);
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("======================");
		VipCustomer customerKim = new VipCustomer();
		
		customerKim.setCustomerName(" 김유신 ");
		customerKim.setCustomerID(10030);
		customerKim.setBonusPoint(10000);
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("======================");
		
		VipCustomer customerHan = new VipCustomer( 2000, "한강");
		
		customerHan.setCustomerName(" 한강 ");
		customerHan.setCustomerID(10040);
		customerHan.setBonusPoint(10000);
		System.out.println(customerHan.showCustomerInfo());
		int agent = customerHan.getAgentId();
		System.out.println("agentId : " + agent); //따로 초기화안해서 0
		System.out.println("======================");
		
		int priceAnh = customerAnh.calcPrice(10000);
		int priceHan = customerHan.calcPrice(10000);
		
		System.out.println(customerAnh.showCustomerInfo());
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println("======================");
		
		Customer customerNa = new VipCustomer(10050,"나몰라");
		customerNa.setBonusPoint(10000);
		customerNa.calcPrice(10000);
		customerNa.showCustomerInfo();
//		customerNa.getAgentId(); 업캐스팅이라 Customer클래스에 없는 메서드는 오류
		
		System.out.println("****************************");
		
		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add(customerNa);
		customers.add(customerHan);
		customers.add(customerKim);
		customers.add(customerLee);
		customers.add(customerAnh);
		
		for ( Customer customer : customers) {
			
			System.out.println(customer.showCustomerInfo());
		}
		
	}

}
