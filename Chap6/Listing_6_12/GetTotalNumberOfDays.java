package Listing_6_12;

public class GetTotalNumberOfDays {
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		int countOfYear = 1980;
		while (  countOfYear < year) {
			countOfYear ++;
			if (LeapYear.isLeapYear(year))
				total = total + 366;
			else
				total = total + 365;
		}
		
		int countOfMonth = 1;
		while ( countOfMonth<month) {
			total = total + GetNumberOfDaysInMonth.getNumberofDayInMonth(year, countOfMonth);
			countOfMonth++;
	}
		return total;

}
}
