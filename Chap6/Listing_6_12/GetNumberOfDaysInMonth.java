package Listing_6_12;

public class GetNumberOfDaysInMonth {
	public static int getNumberofDayInMonth( int year, int num ) {
		if (num == 1 || num == 3 || num == 5 || num ==7 || num ==8 || num == 10 || num ==12 )
			return 31;
		else if ( num == 4 || num ==6 || num == 9 || num ==11 )
			return 30;
		else if (num==2) 
			return LeapYear.isLeapYear(year)?29:28;
		else
			return 0;
	}

}
