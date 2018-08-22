package Listing_6_12;
import java.util.*;
public class prinCalendar {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a full year");
		int year = input.nextInt();
		System.out.println("Enter a month between 1 and 12");
		int month = input.nextInt();
		PrintMonth.printMonth(year, month);
	}

}

