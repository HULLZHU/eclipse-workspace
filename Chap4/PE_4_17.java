import java.util.Scanner;

public class PE_4_17 {

	public static void main(String[] args) {
		
		System.out.println("Now please input a month and a year");
		
		Scanner input = new Scanner(System.in);
		
		String month = input.nextLine();
		
		int year = input.nextInt();
		
		if ( month.equals(month))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		
		else if ( month.equals("Feb"))
		{
			if (year % 4 == 0)
			System.out.println(month + " "+ year +" has 29 days");
			else  
				
				System.out.println(month + " "+ year +" has 28 days");
		}
		
		else if (month.equals("Mar"))
				{
			System.out.println(month + " "+ year +" has 31 days");
				}
		
		else if (month.equals("Apr"))
		{
			System.out.println(month + " "+ year +" has 30 days");
		}
		
		else if (month.equals("May"))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		
		else if (month.equals("Jun"))
		{
			System.out.println(month + " "+ year +" has 30 days");
		}
		
		else if (month.equals("Jul"))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		
		else if (month.equals("Aug"))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		
		else if (month.equals("Sep"))
		{
			System.out.println(month + " "+ year +" has 30 days");
		}
		
		else if (month.equals("Oct"))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		
		else if (month.equals("Nov"))
		{
			System.out.println(month + " "+ year +" has 30 days");
		}
		else if (month.equals("Dec"))
		{
			System.out.println(month + " "+ year +" has 31 days");
		}
		else 
			System.out.println("Please reenter");
		

	}

}
