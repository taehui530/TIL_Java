package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		System.out.println("student ���� ");
	}
	
	public Student ( int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return (studentNumber + " �л��� �̸���, " + studentName + "�̰�, ������ "+ grade + " �Դϴ�. ");
		
	}
}	
