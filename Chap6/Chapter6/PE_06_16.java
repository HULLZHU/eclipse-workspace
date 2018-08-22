package Chapter6;

public class PE_06_16 {

	public static void main(String[] args) {
		System.out.println("Year         Number of Day");
		int year = 2000;
		while ( year < 2020 ) {
			System.out.print(year+"         ");
			System.out.println(computeDay(year));
			year++;
		}
	}

	public static int computeDay(int year) {
		if (year%4 == 0)
			return 366;
		else 
			return 365;
	}
}
