package ch15.market;

public class CustomerTest {

	public static void main(String[] args) {
		
		System.out.println(" ******customer ");
		Customer customer = new Customer();
		customer.sayhello();
		customer.sell();
		customer.buy();
		customer.order();
		System.out.println(" ******Seller ");
		Sell seller = customer;
//		seller.sayhello();
		seller.sell();
		seller.order();
		
		System.out.println(" ******Buyer ");
		Buy buyer  = customer;
		buyer.buy();
		buyer.order();
	}

}
