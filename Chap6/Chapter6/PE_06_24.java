package Chapter6;

public class PE_06_24 {

	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds /1000;
		long totalMinutes = totalSeconds/60;
		long totalHours = totalMinutes / 60;
		long totalDays = totalHours/24;
		long currentHour = totalHours%24;
		long currentMinutes = totalMinutes%60;
		long currentSeconds = totalSeconds%60;
		System.out.println("The time is "+(currentHour)%24+":"+currentMinutes+":"+currentSeconds);
		System.out.println("Year:"+computeYear(totalDays));
		long currentYear = computeYear(totalDays);
		System.out.println("Month:" +computeMonth(computeYear(totalDays),totalDays));
		long currentMonth = +computeMonth(computeYear(totalDays),totalDays);
		long currentDay = totalDays-getTotalDaysSinceCurrentYearBeginningToLastMonthEnding(currentYear,(currentMonth) )- getTotalDaysSinceStarting1970( currentYear-1 )+1 ;
        System.out.println("Day: "+ currentDay);
	}
	

		
	
	
	public static long computeYear( long totalDays) {
		long currentYear = 1970;
		while ( getTotalDaysSinceStarting1970(currentYear) < totalDays ) {
			currentYear++;
		}
		return currentYear;
	}
	
	public static long getTotalDaysSinceStarting1970(long currentYear ) {
		long totalDaysSinceStarting1970 = 0;
		long startingYear = 1970;
		while (startingYear <= currentYear ) {
			if( isLeapYear(startingYear)) {
				totalDaysSinceStarting1970 += 366;
			}
			else
				totalDaysSinceStarting1970 += 365;
			startingYear ++;
		}
		return totalDaysSinceStarting1970;
	}
	
	public static boolean isLeapYear( long Year) {
		if ( Year % 100 != 0 && Year % 4 == 0)
			return true;
		else if ( Year % 400 ==0 && Year %100 ==0)
			return true;
		else
			return false;
	}
	
	public static long  computeMonth( long currentYear, long totalDays) {
		long totalDaysSinceStarting1970toEndingLastYear =  getTotalDaysSinceStarting1970(currentYear-1);
		long totalDaysSinceStaringCurrentYeartoNow = totalDays - totalDaysSinceStarting1970toEndingLastYear;
		long currentMonth = 0;
		long sumOfDaysSinceStartingCurrentYeartoEndingLastMonth= 0;
		while (sumOfDaysSinceStartingCurrentYeartoEndingLastMonth < totalDaysSinceStaringCurrentYeartoNow ) {
			currentMonth++;
			sumOfDaysSinceStartingCurrentYeartoEndingLastMonth= sumOfDaysSinceStartingCurrentYeartoEndingLastMonth + getDaysInAmonth(currentYear,currentMonth);	
		}
		return currentMonth;
		
}
		
			

		
		public static long getDaysInAmonth( long currentYear, long month) {
			if ( month == 1 || month ==3 || month == 5 || month ==7 || month ==8 ||month ==10 || month==12 )
				return 31;
			else if ( month == 4 || month == 6 || month == 9 || month == 10)
				return 30;
			else {
				if ( isLeapYear(currentYear)) {
					return 29;
				}
				else
					return 28;
			
		}
	
}
		
		public static long getTotalDaysSinceCurrentYearBeginningToLastMonthEnding(long currentYear,long month ) {
			long sum = 0;
			long i =1;
			while ( i< month) {
				sum = sum+ getDaysInAmonth(currentYear,i);
				i++;
			}
			return sum;
		}
		}