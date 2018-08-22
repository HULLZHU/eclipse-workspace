import java.util.*;
public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		//MONTH 是以0为基的，即一月份：0，二月份：1
		calendar.set(Calendar.MONTH, 1);
		//calendar.add(Calendar.DAY_OF_WEEK, 1);
		System.out.println("Current Time is "+new Date());
		System.out.println("Year: "+ calendar.get(Calendar.YEAR));
		System.out.println("Month: "+ calendar.get(Calendar.MONTH));
		System.out.println("Date: "+calendar.get(Calendar.DATE));
		System.out.println("Hour :" +calendar.get(Calendar.HOUR));
		System.out.println("Hour_Of_Day: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutes: "+calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " +calendar.get(Calendar.SECOND));
		System.out.println("DAY_OF_WEEK "+ calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_MONTH: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " +calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_YEAR: "+calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("AM_PM: "+ calendar.get(Calendar.AM_PM));
		Calendar calendar1 = new GregorianCalendar(2001,2,11);
		String [] dayNameOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("September 11,2011 is a " +dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

	}

}
