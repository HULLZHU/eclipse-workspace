import java.util.*;
public class For_Loop_Accumulation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		int sum = 0;
		System.out.println("Please input the first postive integer");
		
		for ( int addition = input.nextInt(); addition != 0; addition = input.nextInt())
		{
			sum = sum + addition;
			System.out.println("Please input the next positive integer");
		}
		
		System.out.println("The answer is" + sum);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
