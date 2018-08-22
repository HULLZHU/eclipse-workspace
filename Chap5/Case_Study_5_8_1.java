import java.util.Scanner;

public class Case_Study_5_8_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many test do you want to make?");
		
		int try_time = input.nextInt();
		
		for ( int i = 0; i<try_time ; i++)
		{
		
		System.out.println("enter first integer");
		
		int n1 = input.nextInt();
		
		System.out.println("enter second integer");
		
		int n2 = input.nextInt();
		
		int gcd = 1 ; 
		
		int k = 2 ;
		
		while ( k<=n1 && k<=n2 )
		{
			if (n1 % k ==0 && n2 %k ==0)
				gcd = k ;
			
			System.out.println("The divisor could be " + gcd);
			
			k++;
		}
		
		System.out.println("The greatest common divisor for " + n1 +" and "+ n2 +" is "+gcd+"\n");
		
		System.out.println("--------------------------------------------------------------------------------");
		// TODO Auto-generated method stub
		
		
		}

	}

}
