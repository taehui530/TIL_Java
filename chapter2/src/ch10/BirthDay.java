package ch10;
import java.util.Scanner;

public class BirthDay {
	
	Scanner scanner = new Scanner(System.in);
	int tempMonth=1;
	
	private int year;
	private int month;
	private int day;
	
	private boolean isValid;

	public int getYear() {

		return year;
	}

	public void setYear(int year) {
		if ( year <0 || year >2021) {
			isValid=false;
		}
		else {
			isValid = true;
			this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <1 || month >12) {
			isValid=false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		switch( this.month ) {
		case 1,3,5,7,8,10,12:
			
			if( day <1 || day> 31) {
				
				isValid = false;
			}
			else {
				
				isValid = true;
				this.day = day;
			}
			break;
		case 4,6,9,11 :
			
			if( day <1 || day> 30) {
				
				isValid = false;
			}
			else {
				
				isValid = true;
				this.day = day;
			}
			break;
		case 2 :
			if( day <1 || day> 28) {
				
				isValid = false;
				
				
			}
			else {
				
				isValid = true;
				this.day = day;
			}
			break;
			
		default :
			
			System.out.print(" 달(month)을 깜빡했네요! 태어난 달을 입력해주세요. : ");
			tempMonth = scanner.nextInt();
			
			
			setMonth(tempMonth);
			setDay(day);
			
			break;
		}
	}
	
	public boolean getIsValid() {
		
		return isValid;
	}
	
	public void showBirthDay() {
		if ( isValid) {
		System.out.println(getYear() +" " + getMonth() + " "+getDay() );
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
			
		}
	}
}
