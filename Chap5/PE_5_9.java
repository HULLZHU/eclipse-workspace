import java.util.*;
public class PE_5_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		////////////////////////////////////////////////////
		System.out.println("Please input the number of student");
		int number_of_student = input.nextInt(); 
		/////////////////////////////////////////
		System.out.println("Please input a student's name.");
		String name = input.next();
		////////////////////////////////////////////////////
		System.out.println("Please input the score of a student");
		int score = input.nextInt();
		////////////////////////////////////////
		System.out.println("Please input the name of a student");
		String name_ = input.next();
		//////////////////////////////////////////////////////
		System.out.println("Please input the score of a student");
		int score_= input.nextInt();
		
		if ( score_ > score)
		{
			int temp = score_;
			score_ = score;
			score = temp;
		}
		///
		int count = 0;
		while ( count < number_of_student-1)
		{
			System.out.println("Please input a student's name");
			String name1 = input.next();
			
			System.out.println("Please input a student's score");
			int score1 = input.nextInt();
			
			if ( score1 > score)
			{
				score = score1;
				name = name1;
			}
			
			else if ( score1 > score_)
			{
				score_ = score1;
				name_ =name1;
			}
			count++;
			
		}
		
		System.out.println("The best student is"+ name+" and his/her grade is "+ score);
		System.out.println("The second best student is "+ name_ + " and his grade is "+score_  );
	
		
		
		
		// TODO Auto-generated method stub

	}

}
