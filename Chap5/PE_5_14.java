import java.util.*;
public class PE_5_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input two positive integer");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if ( n2 > n1 )
		{
			int temp = n2;
			n2  =  n1;
			n1  =  temp;
		}
		
		int gcd = 0;
		gcd = n2;
		
		while ( n1%gcd!=0||n2%gcd!=0)
		{
			gcd--;
		}
		System.out.println("The greatest common divisor of n1 and n2 is " + gcd);
		
		
		
		// TODO Auto-generated method stub

	}

}
