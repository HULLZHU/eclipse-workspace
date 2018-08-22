import java.util.*;
public class PrintCalendar  {
	public static void main(String[]args) {
		int year = 0;
		int month = 0;
		if ( args.length > 2) {
			System.out.println("Usage: ");
			System.exit(0);
		}
		else if ( args.length == 2) {
			month = Integer.parseInt(args[0]);
			year =  Integer.parseInt(args[1]);
		}
		else if ( args.length == 1 ) {
			month = Integer.parseInt(args[0]);
			year = new Date().getYear();
		}
		
	}
}
