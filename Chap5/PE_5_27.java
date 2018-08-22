
public class PE_5_27 {

	public static void main(String[] args) {
		System.out.println(" Leap years");
		int count = 0;
		int year = 101;
		while ( year >= 101 && year <= 2100)
		{
			if ( year % 4 == 0)
			{
				count ++;
				if ( count % 10 ==0)
					System.out.println(" " + year);
				else 
					System.out.print(" " + year);
			}
			year ++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
