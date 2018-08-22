package Chapter6;
import java.util.*;
public class Listing_6_3_modified {

	public static void main(String[] args) {
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		System.out.print("The score is "+ getGrade(score));
	}
	
	public static char getGrade(double score) {
		if ( score >= 90.0) {
			return 'A';
		}
		else if ( score >= 80.0) {
			return 'B';
		}
		else if ( score >= 70.0) {
			return 'C';
		}
		else if ( score>= 60.0) {
			return 'D';
		}
		else 
			return 'E';
		
	}

}
