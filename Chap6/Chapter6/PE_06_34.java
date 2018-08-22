package Chapter6;
import java.util.*;
public class PE_06_34 {

	public static void main(String[] args) {
		System.out.println("Please input the year and the month");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		System.out.println("Year: "+year +"    Month: "+month);
		System.out.println("Mon      Tue      Wed      Thur      Fri      Sat     Sun");
		System.out.println("_____________________________________________________");
		
		printMonth(year,month);
	}
	
	public static void printMonth(int year, int month) {
		int totalDays = getTotalDaysInAmonth(year, month);
		int i = 1;
		int startingDay = (1 + 26*(month + 1)/10 + (year%100)+((year%100)/4) + (year/100) + 5*year/100)%7;
		int countOfprint = 0;
		while ( i<= totalDays) {
			while ( countOfprint < startingDay ) {
				System.out.print("         ");
				countOfprint++;
			}
			while ( countOfprint>=startingDay && i<=totalDays) {
				System.out.print(i + "         ");
				countOfprint++;
				if ( countOfprint % 7 == 0) {
					System.out.println("");
				}
				i++;	
			}
			
		}
	}
	
	
	public static int getTotalDaysInAmonth(int year,int month) {
		if ( month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12)
			return 31;
		else if ( month == 2) {
			if ( isLeapYear(year))
				return 29;
			else
				return 28;
		}
		else
			return 30;
	}
	
	public static boolean isLeapYear(int year) {
		if ( year % 100 != 0 &&year %4==0 )
			return true;
		else if ( year % 100 ==0 && year % 400 ==0 )
			return true;
		else
			return false;
	}

}
