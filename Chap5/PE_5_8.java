import java.util.Scanner;

public class PE_5_8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the number of students");
		int number = input.nextInt();
		
		System.out.println("Please input a student's name");
		String name = input.next();
		
		System.out.println("Please input the score of student");
		int score = input.nextInt();
		
		int count = 0;
		
		while( count < number-1)
		{
			System.out.println("Please input a student's name");
			String name1 = input.next();
			
			System.out.println("Please input a student's score.");
			int score1 = input.nextInt();
			
			if ( score1 > score)
			{
				score = score1;
				name = name1;
			}
			count ++;
		}
		
		System.out.println("The top student is" + name + " and the top score is "+ score);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
