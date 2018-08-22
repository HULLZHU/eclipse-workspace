package Listing_6_12;

public class PrintMonthBody {
	public static void printMonthBody(int year, int month) {
		int startDay = GetStartDay.getStartDay(year, month);
		int i =0;
	
		while ( i < startDay) {
			System.out.print("       ");
			i++;
		}
		
		for ( int count = 1; count<=GetNumberOfDaysInMonth.getNumberofDayInMonth(year, month);count++ ) {
			System.out.printf("%7d",count);
			if (( count + startDay)%7==0)
				System.out.println();
		}
		System.out.println();
	}

}
