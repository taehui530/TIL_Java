package ch18;

public class Company {
	
	private Company() {}
	
	private static Company company = new Company();
	
	public static Company getInstance() {
		
		if(company ==null) {
			
			company = new Company();
		}
		return company;
	}
}
