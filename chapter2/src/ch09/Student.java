package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student( int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		this.korea = new Subject();
		this.math = new Subject();
	}
	
	public void setKoreaSubject( String subjectName, int grade) {
		 
		korea.subjectName = subjectName;
		korea.grade = grade;
		
	}
	
	public void setMathSubject( String subjectName, int grade) {
		 
		math.subjectName = subjectName;
		math.grade = grade;
		
	}
	
	public void showStudentScore() {
		
		int total = math.grade + korea.grade;
		
		System.out.println( this.studentName + " 의 총점은 "+ total+ "점 입니다. ");
		
	}

}
