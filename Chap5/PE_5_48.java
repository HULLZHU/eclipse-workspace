import java.util.*;
public class PE_5_48 {

	public static void main(String[] args) {
		System.out.println("Please input a string");
		Scanner input = new Scanner(System.in);
		String s1= input.nextLine();
		int i = 0;
		while ( i<=s1.length()-1) {
			if ( i%2 == 0 )
				System.out.print(s1.charAt(i));
			i++;
		}
		
		
		// TODO Auto-generated method stub

	}

}