package Chapter6;
import java.util.*;
public class PE_06_37 {

	public static void main(String[] args) {
		System.out.println("Please input an integer and its length.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int width = input.nextInt();
		System.out.println(format(num,width));
	}

	private static String format(int num, int width) {
		String s1 = num + "";
		int countOf0 = 0;
		int i = 0;
		if ( s1.length()<width) {
		countOf0 = width - s1.length();
		while ( i<countOf0) {
			s1 = "0"+s1;
			i++;
		}
		return s1;
		}
		else
		return s1;
			
		
	}
	}

