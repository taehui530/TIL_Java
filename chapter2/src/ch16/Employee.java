package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		
		Employee.serialNum++;
		this.employeeId = Employee.serialNum;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

// setter�� ����x. Read- only
//	public static void setSerialNum(int serialNum) {
//		Employee.serialNum = serialNum;
//	}


	
}
