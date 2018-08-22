import java.util.Scanner;

public class Case_Study_5_2_3 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("How many questions do you want to have?");
		
		int Num_of_questions = input.nextInt();
		int count = 0;
		
		int correct_count = 0;
		
		int num1 = (int)(10*Math.random());
		
		int num2 = (int)(10*Math.random());
		
		double start_time = System.currentTimeMillis();
		
		int temp=0;
		
		while(count<Num_of_questions)
		{
			count++;
			if (num1 < num2)
			{
		    temp = num1 ; 
			num1 = num2;
			num2 = temp;
			}
		
			System.out.println("What is the answer of " +num1+"-"+num2);
			
			int answer = input.nextInt();
			
			if (answer == num1 - num2)
			{   
				correct_count++;
				System.out.println("You are right, please prepare for next question\n and now your correct count is"+correct_count);	
			}
			
			else
			{
				System.out.println("You are false");
			}
			
			num1 = (int)(10*Math.random());
			num2 = (int)(10*Math.random());
			
			
			
		}
		
		double end_time = System.currentTimeMillis();
		
		double test_time =(end_time-start_time)/1000;
		
		System.out.println("The count number is " + count+"\n and the correct count is"+correct_count+"\n and the test time is "+test_time  );
		
		
		// TODO Auto-generated method stub

	}

}

