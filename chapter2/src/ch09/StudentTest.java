package ch09;

public class StudentTest {
		
	public static void main(String[] args) {
		
		Student studentKim = new Student(100,"Lee");
		studentKim.setKoreaSubject("����",100);
		studentKim.setMathSubject("����", 100);
		
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("����",80);
		studentLee.setMathSubject("����", 95);
		
		studentKim.showStudentScore();
		studentLee.showStudentScore();
	}
}
