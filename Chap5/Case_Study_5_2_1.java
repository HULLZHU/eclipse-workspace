import java.util.Scanner;

public class Case_Study_5_2_1 {

	public static void main(String[] args) {
		
		System.out.println("Now guess the number the computer has in mind");
		
		int answer = (int)(100*Math.random());
		
		Scanner input = new Scanner(System.in);
		
		int guess = input.nextInt();
		
		while (guess != answer)
		{
			System.out.println("You are false");
			
			if (guess>answer)
				System.out.println("Your guess is too high");
			if (guess<answer)
				System.out.println("Your guess is too low");
			System.out.println("Guess again");
			
			guess = input.nextInt();//提醒第二次键入
		}
		
		System.out.println("You are right");
		// TODO Auto-generated method stub

	}

}
