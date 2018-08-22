import java.util.*;
public class PE_5_16_Modified {

	public static void main(String[] args) {
		
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int factor = 2;
		
		while ( factor <= number)
		{
			if ( number % factor == 0)
			{
		     number = number / factor ;
		     System.out.println(" " + factor);
			}
			else 
			{
				factor++ ;
			}
		}
		// TODO Auto-generated method stub

	}

}
