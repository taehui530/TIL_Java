package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentID = 11111;
		student1.studentName = "Mary";
		student1.address="daejeon";
		
		
		student1.showStudentInfo();
		
		String s1Name = student1.getStudentName();
		student1.setStudentName("Anna");
		
		System.out.println(s1Name +"의 새로운 이름은 "+ student1.getStudentName()+"입니다.");
		
		System.out.println(student1); 
		 
	}
}
 