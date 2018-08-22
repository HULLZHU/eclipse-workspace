import java.util.Scanner;

public class Listing_5_5 {

	public static void main(String[] args) {
		
		
		System.out.println("Now please enter a postive to accumulator and 0 for calculating\nthe final answer");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int sum=0;
		
		while(num!=0)
		{
			sum = sum + num ;
			System.out.println("Now please input an integer.");
			System.out.println("Up to now, the sum is "+sum);
			num = input.nextInt();
		}
		
		System.out.println("Now the final answer is "+sum);
		
		// TODO Auto-generated method stub

	}

}
