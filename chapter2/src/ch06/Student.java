package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {
		System.out.println("student 생성 ");
	}
	
	public Student ( int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return (studentNumber + " 학생의 이름은, " + studentName + "이고, 점수는 "+ grade + " 입니다. ");
		
	}
}	
