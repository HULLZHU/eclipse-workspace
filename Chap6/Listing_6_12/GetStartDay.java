package Listing_6_12;

public class GetStartDay {
	public static int getStartDay ( int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDay = GetTotalNumberOfDays.getTotalNumberOfDays(year, month);
		int StartDayInMonth = (totalNumberOfDay + START_DAY_FOR_JAN_1_1800)%7;
		return StartDayInMonth;
	}

}
