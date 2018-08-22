package Listing_6_12;

public class LeapYear{
	public static boolean isLeapYear ( int year ) {
		if ( year%400 == 0 || (year%4==0&&year%100 !=0))
			return true;
		else 
			return false;
	}
	}


