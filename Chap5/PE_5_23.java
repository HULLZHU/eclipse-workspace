import java.util.*;
public class PE_5_23 {

	public static void main(String[] args) {
		
		System.out.println("Please input a number.");
		Scanner input = new Scanner(System.in);
		
		double num = input.nextDouble();
		double sum = 0;
		
		while ( num >=2)
		{
			sum = sum + 1/num;
			num = num - 1;
		}
		System.out.println(sum);
		
		
		// TODO Auto-generated method stub

	}

}
