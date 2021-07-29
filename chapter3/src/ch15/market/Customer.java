package ch15.market;

public class Customer implements Sell, Buy {

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println(" buy ");
	}

	@Override
	public void sell() {
		System.out.println(" sell ");		
	}
	
	public void sayhello() {
		
		System.out.println(" hi ");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
//		Buy.super.order();
//		Sell.super.order();
		
		System.out.println(" default order method overrided ~~ ");
	}
	

	
}
