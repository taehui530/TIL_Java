package ch02;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Customer customerAnh = new Customer();
		
		customerAnh.setCustomerName(" �Ȼ� ");
		customerAnh.setCustomerID(10010);
		customerAnh.setBonusPoint(1000);
		System.out.println(customerAnh.showCustomerInfo());
	
		System.out.println("======================");
		
		Customer customerLee = new Customer(0, "no name"); //�⺻ ������ ���� ���
		
		customerLee.setCustomerName(" �̼��� ");
		customerLee.setCustomerID(10020);
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("======================");
		VipCustomer customerKim = new VipCustomer();
		
		customerKim.setCustomerName(" ������ ");
		customerKim.setCustomerID(10030);
		customerKim.setBonusPoint(10000);
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("======================");
		
		VipCustomer customerHan = new VipCustomer( 2000, "�Ѱ�");
		
		customerHan.setCustomerName(" �Ѱ� ");
		customerHan.setCustomerID(10040);
		customerHan.setBonusPoint(10000);
		System.out.println(customerHan.showCustomerInfo());
		int agent = customerHan.getAgentId();
		System.out.println("agentId : " + agent); //���� �ʱ�ȭ���ؼ� 0
		System.out.println("======================");
		
		int priceAnh = customerAnh.calcPrice(10000);
		int priceHan = customerHan.calcPrice(10000);
		
		System.out.println(customerAnh.showCustomerInfo());
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println("======================");
		
		Customer customerNa = new VipCustomer(10050,"������");
		customerNa.setBonusPoint(10000);
		customerNa.calcPrice(10000);
		customerNa.showCustomerInfo();
//		customerNa.getAgentId(); ��ĳ�����̶� CustomerŬ������ ���� �޼���� ����
		
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
