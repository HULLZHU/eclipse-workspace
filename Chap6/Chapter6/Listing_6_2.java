package Chapter6;
import java.util.*;
public class Listing_6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a grade");
		double score = input.nextDouble();
		
		System.out.print("The score is ");
		printGrade(score);
	}
	
	public static void printGrade(Double score) {
		if (score >= 90.0) {
			System.out.println('A');
		}
		else if ( score >= 80.0) {
			System.out.println('B');
		}
		else if ( score >= 70.0) {
			System.out.println('C');
		}
		else if (score >= 60.0) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
	}

}
