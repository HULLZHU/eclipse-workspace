import java.util.*;
public class PrintClass {
	static GregorianCalendar myCalendar = new GregorianCalendar();
	public static void main(String[] args) {
		int month = 0;
		int year = 0;
		
		if ( args.length > 2) {
			System.out.println("The usage is wrong . ");
			System.exit(0);
		}
		
		else if ( args.length == 2 ) {
			month = Integer.parseInt(args[0])-1;
			year = Integer.parseInt(args[1]);
			myCalendar.set(Calendar.MONTH, month);
			myCalendar.set(Calendar.YEAR, year);
		}
		else if ( args.length == 1) {
			month = Integer.parseInt(args[0])-1;
			myCalendar.set(Calendar.MONTH, month);
		}
		
		//将时间设置为月初第一天
		myCalendar.set(Calendar.DATE, 1);
		//打印日历
		printCalendar(year,month);
	}
	private static void printCalendar(int year, int month) {
		//打印日历标题
		printHeadline(year,month);
		//获得该月第一天的星期
		int startDay = Calendar.DAY_OF_WEEK;
		//获得这个月一共有几天
		int numberOfDays = getDaysInMonth();
		printCalendarBody(startDay,numberOfDays);
	}
	
	private static void printCalendarBody(int startDay, int numberOfDays) {
		//打印空白
		for(int i = 0; i < startDay-1; i ++ ) {
			System.out.print("   ");
		}
		
		for (int i = 1 ; i <= numberOfDays; i ++ ) {
			if ( i < 10 )
				System.out.print("  "+i);
			else 
				System.out.print(" " + i);
			if (  (i + startDay - 1)% 7 == 0 ) {
				System.out.println("");
			}
		}
		System.out.println("");
	}
	private static int getDaysInMonth() {
		int year = myCalendar.YEAR;
		int month = myCalendar.MONTH;
		if ( month==1 || month==3 || month == 5 || month==7 ||month ==8 || month==10 || month == 12) {
			return 31;
		}
		else if ( month == 4 || month == 6 || month== 8 || month == 10 || month == 12) {
			return 30;
		}
		else {
			if ( (year % 4== 0&&year%100 != 0) || (year%400 ==0 ))
				return 29;
			else 
				return 28;
		}
	}
	//获得月初的第一天的日子
	private static int getStartDate(int year, int month) {
		
		return 0;
	}
	private static void printHeadline(int year, int month) {
		System.out.println((month+1) + ", "+ year);
		
	}

}
