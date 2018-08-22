import java.util.*;
public class PE_07_04 {

	public static void main(String[] args) {
		System.out.println("Please input scores");
		int count = 0;
		int [] scores = new int [100];
		Scanner input = new Scanner(System.in);
		int score = 0;
		while ( score >= 0) {
			score = input.nextInt();
			count ++;
			scores[count - 1] = score;
		}
		
		
		int average = getAverage(scores);
		int countAboveAverage = 0;
		int countBelowAverage = 0;
		for ( int i =0; i<count ; i ++) {
			if (scores[i]>=average)
				countAboveAverage ++;
			else
				countBelowAverage ++;
		}
		
		System.out.println("Above count : "+ countAboveAverage);
		System.out.println("Below average: " + (countBelowAverage-1));
		// TODO Auto-generated method stub

	}

	private static int getAverage(int[] scores) {
		int count = 0;
		int sum = 0;
		for ( int i =0 ;i <scores.length&&scores[i]>=0;i ++) {
				sum = sum +scores[i];
				count++;
		}
		return sum/count;
		// TODO Auto-generated method stub
		
	}

}
