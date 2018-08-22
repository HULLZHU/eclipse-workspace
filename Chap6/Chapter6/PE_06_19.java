package Chapter6;
import java.util.*;
public class PE_06_19 {

	public static void main(String[] args) {
		System.out.println("Please input three sides");
		Scanner input = new Scanner(System.in);
		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		if ( isValid(s1,s2,s3)) {
			System.out.println("isValid");
			System.out.print(area(s1,s2,s3));
		}
		else 
			System.out.println("NotValid");
	}
	
	public static boolean isValid(int s1, int s2, int s3) {
		if ( s1+s2 > s3&& s1+s3>s2&& s3+s2>s1) 
			return true;
		else 
			return false;
	}
	
	public static double area(int s1, int s2, int s3) {
		double p = (s1+s2+s3)/2;
		return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
	}

}
