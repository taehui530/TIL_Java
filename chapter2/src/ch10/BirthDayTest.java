package ch10;
import java.util.Scanner;

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		BirthDay my = new BirthDay();
		
		System.out.print(" �¾ year�� �Է��ϼ���. : ");
		int myYear = scanner.nextInt();
		
		System.out.print(" �¾ day�� �Է��ϼ���. : ");
		int myDay = scanner.nextInt();
		
		my.setYear(myYear);
		my.setDay(myDay);
		
		my.showBirthDay();
	}

}
