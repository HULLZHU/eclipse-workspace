import java.util.*;
public class Listing_5_10 {

	public static void main(String[] args) {
		
		System.out.println("Pease input a number");
		Scanner input = new Scanner(System.in);
		
		int number, sum = 0, count;
		
		for (count = 0; count<5; count++)
		{
			number = input.nextInt();
			
			sum += number;	
			
			System.out.println("Please input another number");
		}
		System.out.println("Sum is " + sum);
		System.out.println("Count is " + count);
		
		// TODO Auto-generated method stub

	}

}
