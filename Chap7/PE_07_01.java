
import java.util.*;
public class PE_07_01 {

	public static void main(String[] args) {
		System.out.println("How many numbers do you want to input?");
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		int [] scores = new int[numberOfStudents];
		System.out.println("Please now enter the grades.");
		for ( int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		for ( int e: scores )
			System.out.printf("%3d",e);
		System.out.println("");
		
		int best = getBest(scores);
		
		for ( int i = 0; i<scores.length;i++) {
			if (scores[i] >= best - 10)
				System.out.print("  A");
			else if (scores[i]>= best -20  )
				System.out.print("  B");
			else if ( scores[i]>=best - 30)
				System.out.print("  C");
			else if ( scores[i]>= best -40)
				System.out.print("  D");
			else
				System.out.print("  F");
			
		}
		
		System.out.println("The max score is "+best);
		
		
		
		// TODO Auto-generated method stub

	}

	private static int getBest(int[] scores) {
		int currentMax = scores[0];
		for ( int i = 1; i < scores.length; i++) {
	         if ( scores[i]>currentMax)
	        	 currentMax = scores[i];
			}
		return currentMax;
		}
		
	}


