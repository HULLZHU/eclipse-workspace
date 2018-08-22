import java.util.Scanner;

public class PE_5_1 {

	public static void main(String[] args) {
		
		System.out.println("Now please input some numbers");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int count_Neg = 0;
		
		int count_Pos = 0;
		
		double total = 0;
		
		double average = 0;
		
		while ( num !=0 )
		{   
			System.out.println("The input number is "+ num );
			
			total = total + num;
			
			if ( num > 0 )
				count_Pos ++;
			
			if ( num < 0)
				count_Neg ++;
			
			average = total/(count_Neg+count_Pos);
			
			System.out.println("Please input a number again");
			
			num = input.nextInt();
		}
		
		System.out.println("Here are "+count_Pos+" positive numbers");
		System.out.println("Here are "+ count_Neg+" positive numbers");
		System.out.println("The total is " + total);
		System.out.println("The average is "+ average);
		// TODO Auto-generated method stub

	}

}
