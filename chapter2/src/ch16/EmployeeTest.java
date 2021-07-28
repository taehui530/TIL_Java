package ch16;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("±Ë≈¬»Ò");

		
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Anna");
		
		
		
		System.out.println( employee1.getEmployeeName()  + " " + employee1.getEmployeeId() );
		System.out.println( employee2.getEmployeeName()  + " " + employee2.getEmployeeId() );

		
		System.out.println( employee1.getSerialNum());
		System.out.println( employee2.getSerialNum());
		System.out.println( Employee.getSerialNum());
	}
	  
	 
}
