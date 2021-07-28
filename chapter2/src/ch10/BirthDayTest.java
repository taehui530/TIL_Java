package ch10;
import java.util.Scanner;

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BirthDay my = new BirthDay();
		
		System.out.print(" 태어난 year를 입력하세요. : ");
		int myYear = scanner.nextInt();
		
		System.out.print(" 태어난 day를 입력하세요. : ");
		int myDay = scanner.nextInt();
		
		my.setYear(myYear);
		my.setDay(myDay);
		
		my.showBirthDay();
	}

}
