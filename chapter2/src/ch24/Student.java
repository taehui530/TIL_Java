package ch24;

import java.util.ArrayList;

public class Student {

		int studentNum;
		String studentName;
		
		ArrayList<Subject> subjectList ;
		
		public Student( int studentNum, String studentName) {
			
			this.studentName = studentName;
			this.studentNum = studentNum;
			
			subjectList = new ArrayList<Subject>();
			
		}
		
		public void addSubject(String subjectName, int score) {
			
			Subject subject = new Subject(subjectName, score);
			subjectList.add(subject);
			
		}
		
		public void showStudentInfo() {
			int total=0;
			
			
			for ( int i=0; i< subjectList.size(); i++) {
				
			System.out.println("�л� "+ studentName + "�� " + subjectList.get(i).subjectName + " ���� ������ " + subjectList.get(i).score+"�Դϴ�.");
			total += subjectList.get(i).score;
		}
			System.out.println("���� : " + total );
		}
}
