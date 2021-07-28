package ch09;

public class StudentTest {
		
	public static void main(String[] args) {
		
		Student studentKim = new Student(100,"Lee");
		studentKim.setKoreaSubject("국어",100);
		studentKim.setMathSubject("수학", 100);
		
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("국어",80);
		studentLee.setMathSubject("수학", 95);
		
		studentKim.showStudentScore();
		studentLee.showStudentScore();
	}
}
